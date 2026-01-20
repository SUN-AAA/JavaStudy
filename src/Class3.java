//오버라이딩

class Animal2{
    String name;

    Animal2(String name){
        this.name = name;
    }

    void sound(){
        System.out.println(name + " : ....");
    }
}

class Cat extends Animal2{
    Cat(String name){
        super(name);
    }

    void sound(){
        System.out.println(name + " : meow");
    }
}

public class Class3 {
    public static void main(String[] args){
        Cat c = new Cat("nabi");
        c.sound();
    }
}
