package Player;

import java.sql.*;

import Connect.connect;

public class Player {
	
	public Connection con;
	public Statement st=null;
	public PreparedStatement ps=null;
	

	public Player() throws Exception {
		// TODO Auto-generated constructor stub
		con=connect.fetchConnection();
	}
	
	public void select() throws Exception
	{
		
		st=con.createStatement();
		ResultSet rst = st.executeQuery("select*from Player");
		while(rst.next())
		{
			System.out.println(rst.getString(1)+" "+rst.getString(2)+" "+rst.getInt(3)+" "+rst.getInt(4));
		}
	}
	
	public void Insert(String Pname,String Team,int Jno,int Age ) 
	{
		
	try
	{
	   ps=con.prepareStatement("insert into Player values(?,?,?,?)");
	   ps.setString(1, Pname);
	   ps.setString(2, Team);
	   ps.setInt(3, Jno);
	   ps.setInt(4, Age);
	   
	   int re=ps.executeUpdate();
	   if(re>0)
	   {
		   System.out.println("Inserted");
	   }
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	 	
	}
	
	public void Delete(String Pname)
	{
		try
		{
			ps=con.prepareStatement("delete from Player where Pname=?");
			ps.setString(1, Pname);
			int re=ps.executeUpdate();
			if(re>0)
			{
				System.out.println("Deleted");
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
