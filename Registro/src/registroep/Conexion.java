/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroep;

import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Familiar
 */
public class Conexion {
     private Connection cnn; 
     private Statement pst;
     private ResultSet rs;
    
    public Conexion (){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        cnn = DriverManager.getConnection("jdbc:mysql://localhost/easyparking", "root", "");}
        catch(Exception e){
            System.out.println("ERROR CONEXION..."+e.getMessage());}
}
    public void desconectar(){
    cnn = null;}
    
    public Connection getCnn(){
    return cnn;}
    
    public void setCnn(Connection cnn){
    this.cnn = cnn;}

    
    
    
    
    public ResultSet consultar (String placa){
    String consulta = "SELECT * FROM registro WHERE PLACA='"+placa+"'";
    try{
        
        pst = cnn.createStatement();
        rs = pst.executeQuery(consulta);

    }
    catch(Exception e){
        System.out.println("no se pudo consultar... "+e.getMessage());
    }
    return rs;
    }
    
    
    
    
    
    
    }
    
  
    


