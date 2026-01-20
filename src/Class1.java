import java.util.Scanner;
class Car{
    String color, gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Class1 {
    public static void main(String[] args){
        Car avante = new Car();
        avante.color = "red";
        System.out.println("avante color : " + avante.color + " porsche gearType : " + avante.gearType + " avante door : " + avante.door);

        Car porsche = new Car();
        porsche.door = 2;
        System.out.println("porsche color : " + porsche.color + " porsche gearType : " + porsche.gearType + " porsche door : " + porsche.door);
    }
}
