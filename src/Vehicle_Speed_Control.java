class Vehicle{
private int speed=0;
    void setSpeed(int value){
        speed+=value;
    }
    int getSpeed(int speed){
        return speed;
    }
void display(){
    System.out.println(speed);
    System.out.println();
}
}

public class Vehicle_Speed_Control extends Vehicle{
    static void main(String[] args) {
Vehicle in=new Vehicle();

in.setSpeed((in.getSpeed(50)));
        in.setSpeed((in.getSpeed(50)));
        in.setSpeed((in.getSpeed(50)));
        in.display();
    }
}
