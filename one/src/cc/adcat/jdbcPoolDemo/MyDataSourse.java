package cc.adcat.jdbcPoolDemo;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

public class MyDataSourse implements DataSource {

    private LinkedList<Connection> pools = new LinkedList<>();

    public MyDataSourse() {
        for (int i = 0; i < 5; i++) {
            Connection connection = PoolsUtil.getConnection();
            pools.addFirst(connection);
        }
        System.out.println("当前有"+pools.size()+"个连接");
    }

    @Override
    public Connection getConnection(){
        Connection connection = pools.removeLast();
        System.out.println("当前有"+pools.size()+"个连接");

        ClassLoader loader = connection.getClass().getClassLoader();
        Class<?>[] interfaces = new Class[]{Connection.class};
        InvocationHandler h = (proxy, method, args) -> {
            if ("close".equals(method.getName())) {
                backToPool(connection);
                return null;
            }
            return method.invoke(connection,args);
        };
        Connection proxyConnection = (Connection) Proxy.newProxyInstance(loader, interfaces, h);


        return proxyConnection;
    }

    public void backToPool(Connection connection){
        pools.addFirst(connection);
        System.out.println("当前有"+pools.size()+"个连接");
    }





    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
