package GenericExample;

public class varargsExample {

    public static void main(String[] args) {
        String imem1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        printShoppingList(imem1, item2, item3);
        printShoppingList("Bread", "Milk", "Eggs", "Bananas");
    }

    // Use 3 dots
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }

}
