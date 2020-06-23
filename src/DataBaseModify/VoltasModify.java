package DataBaseModify;

import DataBaseConn.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBaseObject.Voltas;
import java.util.ArrayList;
import java.util.Arrays;
import telemetria.SimulatorPanel;

public class VoltasModify
{
    //Representação colunas do BD
    private Connection conexao;
    int codigo, codigoGerente;
    String nome, localizacao;

    public VoltasModify() 
    {
        conexao = DBConnection.getConexaoMySql(); //Conexão
    }
    
    public void adiciona(Voltas volta)
    {
        //Inserir na tabela voltas
        String sql = "INSERT INTO voltas(IDCorrida, NumeroVolta, TempoVolta, Carros_IDCarro) VALUES(?, ?, ?, ?)";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql); //Conxão BD
            stmt.setString(1, ""+volta.getIDCorrida()); //Pega ID da corrida
            stmt.setString(2, ""+volta.getNumeroVolta()); //Pega Numero da volta
            stmt.setString(3, ""+volta.getTempoVolta()); //Pega tempo da volta
            stmt.setString(4, ""+volta.getCarrosIDCarro()); //Pega ID do carro
            stmt.execute(); //Executa inserção
            stmt.close(); //Fecha conexão
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public void setaDados(String NomeCarro, int NumeroVolta, Voltas voltas)
    {
        try {//Seta o ID da corrida
            String sql = "select IDCorridas from corridas where CarroVencedorID is null"; //Seleciona ID da corrida em que ainda n teve um carro vencedor
            PreparedStatement stmt = conexao.prepareStatement(sql); //Conexão BD
            ResultSet set = stmt.executeQuery(); //Executa query
            while(set.next()) //Loop para pegar dados da query
                voltas.setIDCorrida(Integer.parseInt(set.getString("IDCorridas"))); //Pegar dado da coluna de IDCorridas
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        voltas.setNumeroVolta(NumeroVolta); //Seta o numero da volta
        try {
            String sql = "select IDCarro from carros where NomeCarro = ?"; //Seleciona ID do carro
            PreparedStatement stmt = conexao.prepareStatement(sql); //Conexão BD
            stmt.setString(1, NomeCarro); //Seta nome carro
            ResultSet set = stmt.executeQuery(); //Executa query
            while(set.next()) //Loop pegar dados da query
                voltas.setCarrosIDCarro(Integer.parseInt(set.getString("IDCarro"))); //Pegar dado da coluna IDCarro
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        adiciona(voltas); //Insere dados na tabela voltas
    }
}
