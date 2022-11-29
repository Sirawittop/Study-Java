// นายสิรวิชญ์ คำชุ่ม 64020822
class Vehicle {
    public boolean started;
    public int speed;
    Vehicle(){
        this.started = false;
        this.speed = 0;
    }
    Vehicle(boolean started,int speed){
        this.started = started;
        this.speed = speed;
    }
    void start(){
        this.started = true;
    }
    void increase_speed(int delta){
        this.speed += delta;
    }
}
class Car extends Vehicle {
    public boolean trunk_open;
    Car(boolean started,int speed){
        super(started,speed);
    }
    void open_trunk(){
        System.out.println("open_trunk");
    }
    void close_trunk(){
        System.out.println("close_trunk");
    }
}
class Motorcycle extends Vehicle {
    boolean center_stand_out ;
}
public class Inherritant{
    public static void main(String[] args) {
        Car person = new Car(true,400);
        System.out.println("Status = "+person.started);
        System.out.println("Speed = "+person.speed);
        person.increase_speed(200);
        System.out.println("Speed After : "+person.speed);
        person.close_trunk();
        person.open_trunk();
        Car sirawit = new Car(false,0);
        System.out.println("Status = "+sirawit.started);
        System.out.println("Speed = "+sirawit.speed);
        sirawit.increase_speed(20000);
        System.out.println("Speed After : "+sirawit.speed);
        sirawit.close_trunk();
        sirawit.open_trunk();
    }
}

