//추상클래스
//공통 뼈대(설계)를 제공하면서, 일부 동작은 자식에게 강제로 맡기는 클래스 (반쯤 완성된 클래스)

//객체 생성 불가, 추상 메서드를 가질 수 있음, 추상 메서드를 가진 자식은 반드시 오버라이딩 해야함.

abstract class Animal4{         //추상 클래스
    String name;

    Animal4(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println(name + " is sleeping.");
    }

    abstract void sound();      //추상 메서드
}

class Cat0 extends Animal4{
    Cat0(String name){
        super(name);
    }

    void sound(){
        System.out.println(name + " meoww");    //오버라이딩 하여 메서드 완성
    }
}

public class Class5 {
    public static void main(String[] args){
        Animal4 c = new Cat0("nabi");

        c.sound();
        c.sleep();
    }
}
