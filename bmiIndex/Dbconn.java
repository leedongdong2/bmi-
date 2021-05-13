package Mdata;
import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconn {
	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    String user = "hr";
    String pwd = "1111";
    Connection conn = null;

    public Connection getConn() {
    try {
    Class.forName(driver);
    conn = DriverManager.getConnection(url, user, pwd);
    } catch(Exception ex) {
    	ex.printStackTrace();
    }
      return conn;
    }


}
