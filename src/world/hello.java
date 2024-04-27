package world;

import java.sql.SQLException;


public class hello
{
    public static void main(String[] args){
        AdditionFrame frame = new AdditionFrame();
       try{
            JDBCTest.f1();
        }
       catch(SQLException e){
            System.out.println(e.getMessage());
        }



    }

}
