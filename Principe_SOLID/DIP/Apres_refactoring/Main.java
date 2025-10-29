public class Main {
    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("'Données à sauvegarder'");

        Database database1 = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database1);
        order1.processOrder("'Données à sauvegarder'");
    }
}

