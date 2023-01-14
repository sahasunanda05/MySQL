package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","laaomi@1");
            if (connection != null) {
                System.out.println("Connection Established");
            }
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return connection;

    }

    public void deleteStudentData() throws SQLException {
        // call getConnection() method
        Connection connection = getConnection();
        int rowDeleted = 0;
        try {
            Statement statement = connection.createStatement();
            rowDeleted = statement.executeUpdate("DELETE FROM student WHERE RollNo =14;");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        if (rowDeleted >0){
            System.out.println("Row Deleted");
        }
        else {
            System.out.println("Error In Deletion");
        }

    }

    public void updateStudentData() throws SQLException {
        //call getConnection() method
        Connection connection = getConnection();
        int rowUpdated = 0;
        try {
            Statement statement = connection.createStatement();
            //execute update query
            rowUpdated = statement.executeUpdate("UPDATE student SET Grades = 'B' WHERE TotalMarks = 678  and rollNo= 15");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        if (rowUpdated >0){
            System.out.println("Row Updated");
        }
        else {
            System.out.println("Updation failed");
        }


    }

    public static void main(String[] args) {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.getConnection();
        try {
            salesDataDemo.deleteStudentData();
            salesDataDemo.updateStudentData();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
