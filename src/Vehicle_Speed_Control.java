class Vehicle{
private int speed=0;
    void setSpeed(int value){
        speed+=value;
    }
    int getSpeed(){
        return speed;
    }

void display(){
    System.out.println(speed);

}
}

public class Vehicle_Speed_Control extends Vehicle{
    static void main(String[] args) {
        Vehicle_Speed_Control in = new Vehicle_Speed_Control();

        System.out.println(in.getSpeed());
in.setSpeed(50);
in.setSpeed(100);
        in.setSpeed(100);
        in.display();
    }
}
