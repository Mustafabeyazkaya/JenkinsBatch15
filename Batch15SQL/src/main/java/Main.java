import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String urlDB= "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String usernameDB = "syntax_hrm";
        String passwordDB = "syntaxhrm123";
        Connection connection= null;
        try {
            connection=DriverManager.getConnection(urlDB,usernameDB,passwordDB);
            //  statement is the car that get your query from java to take it to database and take those data to take it to java
            Statement statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select emp_number,emp_firstname,emp_lastname,name " +
                    "from hs_hr_employees as emp " +
                    "join ohrm_employment_status as sta " +
                    "on emp.nation_code=sta.id order by emp_lastname;");
            while (resultSet.next()){
                int empNumber=resultSet.getInt("emp_number");
                //String id=resultSet.getString("id");
                String firstname=resultSet.getString("emp_firstname");
                String lastname=resultSet.getString("emp_lastname");
                //int age=resultSet.getInt("age");
                System.out.println(empNumber+" "+firstname+" "+lastname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
