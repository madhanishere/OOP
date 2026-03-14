class Box<T> {
    private T content;

    public void add(T item) {
        this.content = item;
    }

    public T get() {
        return content;
    }
}

public class Generics {
    public static void main(String[] args) {
        // Passing String
        Box<String> nameBox = new Box<>();
        nameBox.add("Arjun");
        String name = nameBox.get(); // No casting
        System.out.println(name);

        // Integer
        Box<Integer> ageBox = new Box<>();
        ageBox.add(21);
        Integer age = ageBox.get();
        System.out.println(age);
    }
}