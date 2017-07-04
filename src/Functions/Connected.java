package Functions;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connected {

    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static Connection con;

    public static Connection getcon() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection("jdbc:sqlserver://WORKSPACE\\Dev:1433;databaseName=" + "SIM" + ";integratedSecurity=true");
            } catch (Exception e) {
                e.getStackTrace();
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return con;
    }
}
