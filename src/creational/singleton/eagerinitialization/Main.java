package creational.singleton.eagerinitialization;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<DatabaseConnection> databaseConnections = new HashSet<>();

        for (int i = 0; i < 100; ++i)
            databaseConnections.add(DatabaseConnection.getInstance());

        System.out.println("Number of created database connections: " + databaseConnections.size());
    }
}
