/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wpsj.da;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Phi
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Phi
 */
public class DBConnection {
    private static Connection connection;
    public Connection getConnection() throws ClassNotFoundException,
            SQLException{
        if(connection==null)
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection=
                    DriverManager.getConnection("jdbc:derby://localhost:1527/Product", "sa", "sa");
            
        }
        return connection;
    }
    
}
