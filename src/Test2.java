class Employee{
    String name;
    Employee(){
name="no name given";
    }
    Employee(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
}




public class Test2 {
    static void main(String[] args) {
        Employee t1=new Employee("ravi");
        Employee t2=new Employee();
t1.display();
t2.display();
    }
}
