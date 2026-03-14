class Student{
    int age=21;
    String name="madhan";
}

class Rank_holder <T>{
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
public class Generics2 {
    static void main(String[] args) {
        Student s1=new Student();
        Rank_holder <Student> studentRankHolder= new Rank_holder<Student>();
        studentRankHolder.setData(studentRankHolder.data);
        System.out.println(studentRankHolder.getData());
    }
}
