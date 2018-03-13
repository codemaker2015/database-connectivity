/*
#Created by Codemaker
#Before doing this in your eclipse, please download the corresponding jdbc driver from the net using the following link
#https://github.com/codemaker2015/database-connectivity

#If you're wanting to include a JAR file to your Eclipse project, you would generally create a 'lib' folder inside the project folder, and put the file in there. 
#You then need to tell eclipse to include it in your class path so your code will compile and run inside eclipse.
#To do that: - Go into the properties of your project - Select 'Java Build Path' in the left hand column - Select the 'Libraries' tab in the centre part of the window - 
#Click the Add JARs button - this will give you a list of your projects in eclipse - expand your project and into the lib folder - your jar will be there. - Select the JAR, click OK, and OK again out of the properties window.
#Or, you can just right-click the jar and click BuildPath->Add to Build Path.
*/

import java.sql.*;

class MysqlCon{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");

//getConnection(jdbc:mysql:database,username,password)

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/radio","root","");

//create a statement object  
Statement stmt=con.createStatement();

/*perform query using 
execute method - For create table
executeQuery method - For select query
executeUpdate method - For update and insert
*/

ResultSet rs=stmt.executeQuery("select * from tblLogin");

while(rs.next())
System.out.println("Username: "  + rs.getString(1)+", Password: "+rs.getString(2));

con.close();

}catch(Exception e){ System.out.println(e);}

}
}