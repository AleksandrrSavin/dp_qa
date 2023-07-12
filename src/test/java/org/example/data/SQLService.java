package org.example.data;

import lombok.SneakyThrows;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLService {
    private SQLService() {
    }

    public static String url = System.getProperty("dbUrl");
    public static String user = System.getProperty("dbUser");
    public static String password = System.getProperty("dbPassword");

    @SneakyThrows
    public static String checkPaymentStatus() {
        QueryRunner qrunner = new QueryRunner();
        Connection connect = DriverManager.getConnection(url, user, password);
        String status = "SELECT status FROM payment_entity ORDER BY created DESC LIMIT 1";
        return qrunner.query(connect, status, new ScalarHandler<String>());
    }

    @SneakyThrows
    public static String checkCreditStatus() {
        QueryRunner qrunner = new QueryRunner();
        Connection connect = DriverManager.getConnection(url, user, password);
        String status = "SELECT status FROM credit_request_entity  ORDER BY created DESC LIMIT 1";
        return qrunner.query(connect, status, new ScalarHandler<String>());
    }

    @SneakyThrows
    public static void clear() {
        QueryRunner qrunner = new QueryRunner();
        Connection connect = DriverManager.getConnection(url, user, password);
        qrunner.update(connect, "DELETE FROM credit_request_entity");
        qrunner.update(connect, "DELETE FROM payment_entity");
    }
}