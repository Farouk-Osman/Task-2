public class Receipt {
    public void printReceipt(Sandwich sandwich) {
        System.out.println("Receipt:");
        System.out.println(sandwich.getDescription());
        System.out.println("Total: " + sandwich.getCost());
    }
}
