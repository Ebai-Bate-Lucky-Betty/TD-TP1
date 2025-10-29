public class OrderProcessor {
    private MySQLDatabase database;
    public OrderProcessor() {
        this.database = new MySQLDatabase(); // concrete dependency
    }
    public void processOrder(String order) {
        database.save(order);
    }
}
