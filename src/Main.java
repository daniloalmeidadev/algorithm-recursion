public class Main {

    public static void main(String[] args) {
        regression(10);
    }

    private static void regression(int quantity) {
        System.out.println("Quantity: " + quantity);

        if (quantity == 0) {
            return;
        }
        regression(quantity - 1);
    }
}
