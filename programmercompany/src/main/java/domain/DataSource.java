package domain;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    public static final DataSource INSTANCE = new DataSource();
    private HikariConfig config = new HikariConfig(
            getClass().getClassLoader().getResource("datasource.properties").getFile()
    );
    private static HikariDataSource ds;

    private DataSource() {
    }

    public static DataSource getInstance() {
        return INSTANCE;
    }

    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
