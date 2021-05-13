package Mdata;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class MemberController {
   Connection conn;
   PreparedStatement ps;
   
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
   
   }
