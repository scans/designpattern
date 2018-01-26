package cn.coolcc.designPatterns.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * 简陋的连接池
 * Created by chencheng on 17/1/5.
 */
public class DataSource {
    private static final int MAX_POOL_SIZE = 10;
    private static List<Connection> connectionList = new LinkedList<>();

    private DataSource() {
        if (connectionList.size() == 0) {
            for (int i = 0; i < MAX_POOL_SIZE; i++) {
                try {
                    connectionList.add(createConnection());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/demo", "root", "123456");
    }


    public Connection getConnection() {
        if (connectionList.size() > 0) {
            return new ConnectionStaticProxy(connectionList.remove(connectionList.size()));
        } else {
            //不做任何处理,主要是为了研究代理模式
            return null;
        }
    }

    public void recoveryConnection(Connection connection) {
        connectionList.add(connection);
    }

    public static DataSource getInstance() {
        return SingleDataSource.instance;
    }

    private static class SingleDataSource {
        private static final DataSource instance = new DataSource();
    }
}
