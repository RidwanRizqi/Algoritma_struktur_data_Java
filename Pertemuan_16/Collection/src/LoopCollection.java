import java.util.*;

public class LoopCollection {
    public static void main(String[] args) {

        // MODIFIKASI NOMOR 4

        Stack<String> fruits = new Stack<>();
//        List<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // MODIFIKASI NOMOR 2

//        fruits.push("Melon");
//        fruits.push("Durian");

        // MODIFIKASI NOMOR 5

        fruits.push("Melon");
        fruits.push("Durian");
        fruits.push("Strawberry");

        // MODIFIKASI NOMOR 6
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        fruits.sort(String::compareTo);

        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
