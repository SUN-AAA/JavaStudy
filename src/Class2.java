//기본 상속
class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + ": ....");
    }

    void sleep(){
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal{
    Dog(String name){
        super(name);
    }

    void wagTail(){
        System.out.println(name + " is wagging tail.");
    }
}

public class Class2 {
    public static void main(String[] args){
        Dog d = new Dog("Bori");
        d.sound();
        d.sleep();
        d.wagTail();
    }
}
