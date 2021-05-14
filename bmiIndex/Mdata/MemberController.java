package Mdata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class MemberController {
   Connection conn;
   PreparedStatement ps;
   ResultSet rs;
   public MemberController() {
	   this.conn = new Dbconn().getConn();
   }
   
   
   public String MemberAdd(Member m){
	   String str = "";
	   String sql = "insert into hr.member values (?, ?, ?, ?, ?)"; 
	   try {
		ps = conn.prepareStatement(sql);
		ps.setString(1, m.getMid());
		ps.setString(2, m.getPassword());
		ps.setString(3, m.getEmail());
		ps.setInt(4, m.getAge());
		ps.setString(5, m.getGender());
		
		int result = ps.executeUpdate();
		
	    if(result == 1 ) {
	    	str = "회원가입이 정상적으로 되었습니다";
	    }else {
	    	str = "오류가 생겻습니다";
	    }
		 		 
		   
	   } catch(Exception ex){
		   ex.printStackTrace();
		   return "오류가 생겻씁니다";
	   }
	   
	   
	   return str;
   }
   
   
   public String idSameCheck(String mid) {
	  String str = null;
	  String sql = "SELECT MID FROM MEMBER WHERE MID = ? "; 
	   
	  try {
		   ps = conn.prepareStatement(sql);
		   ps.setString(1, mid);
		   rs = ps.executeQuery();
		   
		   if(rs.next()) {
		    str = rs.getString("MID");
		   }
	   }catch(Exception ex){
		   ex.printStackTrace();
		   str = "오류가 생겼습니다";
		   return str ;
	   }
	   
	   return str;
   }
   
   public List<String> login(String mid,String mpwd){
	   
	   List<String> list = new ArrayList<String>();
	   String sql = "SELECT MID,PASSWORD,GENDER,AGE FROM MEMBER WHERE MID = ?  AND PASSWORD = ? ";
	   try {
		   ps = conn.prepareStatement(sql);
		   ps.setString(1, mid);
		   ps.setString(2, mpwd);
		   rs = ps.executeQuery();
		   
		   if(rs.next()) {
			  list.add(rs.getString("MID"));
			  list.add(rs.getString("PASSWORD"));
			  list.add(rs.getString("GENDER"));
			  list.add(rs.getString("AGE"));
		   }else if(!(rs.next())) {
			   list = null;
		   }
		   
	   }catch(Exception ex){
		   ex.printStackTrace();
	   }
	   
	   return list;   
   }
   
   
   }
