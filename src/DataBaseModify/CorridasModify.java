package DataBaseModify;

import DataBaseConn.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DataBaseObject.Corridas;
import java.util.ArrayList;
import java.util.Arrays;
import telemetria.Frame;
import telemetria.SimulatorPanel;

public class CorridasModify
{
    //Representa os campos da tabela no BD
    private Connection conexao;
    int codigo, codigoGerente;
    String nome, localizacao;

    public CorridasModify() 
    {
        conexao = DBConnection.getConexaoMySql(); //Conecta ao BD
    }
    
    public void Adiciona() //Adiciona na tabela
    {
        //SQL statement
        String sql = "insert into corridas (TempoTotal) values('')";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql); //conectar
            stmt.execute(); //executar comando sql
            stmt.close(); //fechar conexão
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void Update(Corridas race) //Dar update na tabela
    {
        //Comando SQL para update
        String sql = "update corridas set TempoTotal = ?, CarroVencedorID = ? where CarroVencedorID is null";
        try 
        {
            PreparedStatement stmt = conexao.prepareStatement(sql); //conexão com o BD
            stmt.setString(1, race.getTempoTotal()); //Pegar o tempo total da corrida
            stmt.setString(2, ""+race.getCarroVencedorID()); //Pegar carro vencedor
            stmt.execute(); //executar update
            stmt.close(); //fechar conexão
        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
   
    public void setaDados() //Define os dados a serem inseridos
    {
        //Pega o texto do páreo e pega somente o primeiro carro
        String listPareo[] = SimulatorPanel.Pareo.getText().split("\n"); //divide o texto na quebra de linha
        ArrayList<String> Vencedor = new ArrayList<>(Arrays.asList(listPareo)) ; //Array para pegar os elementos dividos do páreo
        Corridas corridas = new Corridas(); //Acesso objeto corrida
        corridas.setTempoTotal(Frame.Hour.getText() + ":" + //Seta tempo total
                            Frame.Minute.getText() + ":" +
                            Frame.Second.getText() + ":" +
                            Frame.Ms.getText());
        try {
            //Seleciona o ID do carro da tabela Carro apartir do nome
            String sql = "select IDCarro from carros where NomeCarro = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql); //Conecta BD
            stmt.setString(1, Vencedor.get(1)); //Pega nome do carro vencedor
            ResultSet set = stmt.executeQuery(); //Executa a query
            while(set.next()) //Loop para pegar o dado da query
                corridas.setCarroVencedorID(Integer.parseInt(set.getString("IDCarro"))); //Pegar o primeiro dado da coluna IDCarro
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        Update(corridas); //Da um update na tabela corridas com os novos dados
    }
}
