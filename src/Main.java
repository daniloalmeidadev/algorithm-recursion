public class Main {

    public static void main(String[] args) {
        regression(10);
    }

    private static void regression(int quantity) {
        System.out.println("Quantity: " + quantity);

        if (quantity == 0) { // Base case (when quantity is 0, stop recursion)
            return;
        } else { // Recursive case (call regression with quantity -1)
            regression(quantity - 1);
        }
    }
}
