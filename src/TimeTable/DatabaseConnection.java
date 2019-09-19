package TimeTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class DatabaseConnection {
    String user;
    String password;
    String dbms;
    String serverName;
    String dbName;
    String portNumber;
    public Connection getConection() throws SQLException {
        Connection conn = null;
        var connectionProps = new Properties();
        connectionProps.put("user", this.user);
        connectionProps.put("password", this.password);

        if (this.dbms.equals("mysql")) { 
            conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" + this.serverName + ":" + this.portNumber + "/", connectionProps);

        } else if (this.dbms.equals("derby")) {
            conn = DriverManager.getConnection("jdbc:" + this.dbms + ":" + this.dbName + ";create=true", connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }
}