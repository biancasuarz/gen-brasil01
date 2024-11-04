package testesAulas;

import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<Integer, String> produtos = new HashMap<>();
        produtos.put(1, "Apple");
        produtos.put(2, "Banana");
        produtos.put(3, "Orange");

        System.out.println(produtos);
        System.out.println(produtos.get(3));
        System.out.println(produtos.remove(3));
        System.out.println(produtos);
        System.out.println(produtos.size());
        System.out.println();

        for (Integer key : produtos.keySet()) {
            System.out.println(key + ": " + produtos.get(key));
        }
    }
}
