package creational.singleton.eagerinitialization;

public class DatabaseConnection {
    private static final DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        return databaseConnection;
    }
}
