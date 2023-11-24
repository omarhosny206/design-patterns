package creational.singleton.doublecheckedlocking;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (databaseConnection == null) {
            synchronized (DatabaseConnection.class) {
                if (databaseConnection == null) {
                    databaseConnection = new DatabaseConnection();
                }
            }
        }

        return databaseConnection;
    }
}
