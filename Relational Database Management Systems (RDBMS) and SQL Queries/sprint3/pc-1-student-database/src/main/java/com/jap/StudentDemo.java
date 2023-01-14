package com.jap;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo
{
    public Connection connectDB(){
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
    public boolean createTable() throws SQLException {
        Connection connection = connectDB();
        boolean flag = false;
        try{
            Statement statement = connection.createStatement();
            flag=statement.execute("create table if not exists student" + "(Name varchar(40), RollNo int, Grades varchar(5), TotalMarks int)");
            flag= true;
            System.out.println("TABLE CREATED");

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        finally {
            connection.close();
        }
        return flag;
    }

    public String insertIntoStudentTable() throws SQLException {
        Connection connection = connectDB();
        int rowInserted = 0;
        try {
            Statement statement = connection.createStatement();
            rowInserted = statement.executeUpdate("insert into student(Name, RollNo, Grades, TotalMarks) values"+"(\"Moon\", 01,\"A\", 999),"
                            +"(\"Arko\", 05,\"A\", 951)," +"(\"Toon\", 14,\"C\", 766)," + "(\"Rup\", 23,\"B\", 833)," +"(\"Pooja\", 15,\"C\", 678)");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

        System.out.println("Row inserted:"+ rowInserted);
       if(rowInserted >0 ){
           return "Rows successfully inserted";
       }
       else{
           return "Row Not Inserted";
       }
    }
    public List<Student> getAllStudentDetails() {
        //Load the Drivers
        Connection connection = connectDB();
        // Get the connection from database

        List<Student> list = new ArrayList<>();
        Student student = null;
        //Create statement object

        try{
            Statement statement = connection.createStatement();
            //execute the query
            //display the ResultSet Data
            ResultSet resultSet = statement.executeQuery("Select * from student");
            while (resultSet.next()){
                student = new Student();
                student.setName(resultSet.getString(1));
                student.setRollNo(resultSet.getInt(2));
                student.setGrades(resultSet.getString(3));
                student.setTotalMarks(resultSet.getInt(4));
                list.add(student);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }


    public static void main( String[] args ) {
        StudentDemo studentDemo = new StudentDemo();
        try {
            studentDemo.createTable();
            System.out.println(studentDemo.insertIntoStudentTable());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(studentDemo.getAllStudentDetails());
    }
}
