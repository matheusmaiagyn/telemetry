package DataBaseConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
    //Variável de conexão com o BD
    public static String status = "Sem conexão";
    
    public static Connection getConexaoMySql()
    {
        Connection con; //Variável de tipo conexão
        try 
        {
            String driverName = "com.mysql.jdbc.Driver"; //Driver do mysql
            Class.forName(driverName);
            String serverName = "localhost"; //server do BD
            String mydatabase = "telemetria"; //Nome do BD
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?serverTimezone=UTC"; //URL de acesso ao BD
            String username = "root"; //Username do BD
            String password = ""; //Senha do BD
            con = DriverManager.getConnection(url, username, password); //Conexão ao BD
            if(con != null)
                status = "Conectado com sucesso"; //Conectado
            else
                status = "Não foi possivel conectar"; //Sem conexão
            return con;
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Driver não encontrado!!!");
        }
        catch (SQLException e)
        {
            System.out.println("Erro na conexão!!");
        }
        return null;
    }
    
    public static String getStatus()
    {
        return status; //Status da conexão
    }
    
    public static boolean fecharConexao() //Fechar conexão
    {
        try 
        {
            getConexaoMySql().close();
            return true;
        }
        catch (SQLException e) 
        {
            return false;
        }
    }
    
    public static Connection reiniciaConexao() //Reiniciar a conexão
    {
        fecharConexao();
        return getConexaoMySql();
    }
}
