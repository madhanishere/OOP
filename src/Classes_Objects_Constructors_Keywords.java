public class Classes_Objects_Constructors_Keywords {
    static void main(String[] args) {
Student madhan =new Student();
// constructors used to initialize object of a class
// should be same as class name created
// no return type
        System.out.println(madhan.rno);
        System.out.println(madhan.marks);
        System.out.println(madhan.name);

    }
}
class Student{
    int rno;
    int marks;
    String name;
    Student(){
        // calling constructor one from another constructor
        // internally it is new Student(15,50,"maddy");
        this(15,50,"maddy");
    }
    Student(int roll,int marks,String name){
        //this keyword is used to refer to the instance variable of the current object of a class.
this.rno=roll;
this.marks=marks;
this.name=name;
    }
}

