import java.util.*;

class ListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10); // duplicate allowed

        System.out.println(list);
    }
}
