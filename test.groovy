import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class YourSnowflakeConnectionTestScript {
    static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:snowflake:https://ceudjkl-ib64558.snowflakecomputing.com/";
        String user = "ry";
        String password = "Admin@123";

        // Attempt to establish a connection
        try {
            // Load the Snowflake JDBC driver
            Class.forName("net.snowflake.client.jdbc.SnowflakeDriver");
            
            // Establish the connection
            Connection conn = DriverManager.getConnection(url, user, password);
            
            // If connection is successful, print a success message
            println("Successfully connected to Snowflake!");
            
            // Close the connection
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            // If connection fails, print an error message
            println("Failed to connect to Snowflake: " + e.getMessage());
        }
    }
}
