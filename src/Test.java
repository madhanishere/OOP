class Car{
    String brand=null;
    int price=0;
    Car(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    void display(){
        System.out.println(brand);
        System.out.println(price);

    }
}

public class Test {
    static void main(String[] args) {
        Car t1=new Car("bmw",10000);
        Car t2=new Car("audi",15000);
        t1.display();
        t2.display();
    }
}
