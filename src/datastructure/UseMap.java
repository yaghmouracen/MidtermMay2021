package datastructure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import java.util.Properties;

public class UseMap {

    public static void main(String[] args) throws FileNotFoundException, SQLException {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        useMap();
        connectToDB();

    }

    public static void useMap() {
        HashMap<Integer, String> studentInforamtion = new HashMap<>();
        studentInforamtion.put(1, "John");
        studentInforamtion.put(2, "Michael");
        studentInforamtion.put(3, "Jane");

        System.out.println(studentInforamtion.get(2));

        HashMap<String, Integer> locationInfo = new HashMap<>();
        locationInfo.put("Park", 7);
        locationInfo.put("home", 9);
        System.out.println(locationInfo.get("home"));

        System.out.println(studentInforamtion);
        System.out.println(locationInfo);

        System.out.println(studentInforamtion.size());
        System.out.println(studentInforamtion.containsKey(2));
        System.out.println(studentInforamtion.containsKey(22));
        System.out.println(locationInfo.containsKey("home"));


    }

    public static void connectToDB() throws FileNotFoundException, SQLException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/secret.properties");
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String username = properties.getProperty("MYSQLJDBC.userName");
        String password = properties.getProperty("MYSQLJDBC.password");
        String dataBaseName = "world";
        String url = "jdbc:mysql://localhost:3306/" + dataBaseName + "?serverTimezone=UTC";
        System.out.println(username + " " + password + " " + dataBaseName + " " + url);

        String query = "select * from city";
        try {
            Class.forName("MYSQLJDBC.driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("Name");
            String countryCode = resultSet.getString("CountryCode");
            System.out.println(id + " " + name + " " + countryCode);


        }


        connection.close();
        statement.close();
    }

}