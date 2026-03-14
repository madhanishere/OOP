class box<T>{
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
public class Generics3 {
    static void main(String[] args) {
        box<String> stringbox=new box<String>();
        stringbox.setData("Madhan");
        System.out.println(stringbox.getData());

    }

}
