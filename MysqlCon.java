import java.sql.*;

class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/radio","root","");
//getConnection("");
 
Statement stmt=con.createStatement();

ResultSet rs=stmt.executeQuery("select * from tblLogin");

while(rs.next())
System.out.println("Username: "  + rs.getString(1)+", Password: "+rs.getString(2));

con.close();

}catch(Exception e){ System.out.println(e);}

}
}