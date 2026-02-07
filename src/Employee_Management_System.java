public class Employee_Management_System {
    int id;
    String name;
    int salary;
    Employee_Management_System(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void Display(){
        System.out.println(id+" "+name+" "+salary);
    }

    static void main(String[] args) {
        Manager ob=new Manager(21,"ravi",100000,5000);
        ob.Display();
    }
}
class Manager extends Employee_Management_System{
int bonus;
Manager(int id,String name,int salary,int bonus){
super(id,name,salary);
this.bonus=bonus;
}
    void Display(){
        System.out.println(id+" "+name+" "+salary+" "+bonus);
        System.out.println();
    }

}
