
package inhertance;


public class Inhertance {

    
    public static void main(String[] args) {
       Car car=new Car();
       car.go();
        System.out.println(car.door);
   //     This topic is a bout Inhertance how it work;
    }
    
}
class Vehicle{
    Double speed;
    void go(){
        System.out.println("this vehicle is moving");
    }
    void stop(){
        System.out.println("this vehicle is stop");
    }
}
class Bicycle extends Vehicle{
     int  wheels=2;
    int pedals=2;
}
class Car extends Vehicle{
     int door=4;
    int wheels=4;
}