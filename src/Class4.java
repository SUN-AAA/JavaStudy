//다형성(polymorphism)
//변수 타입과 객체의 실제 타입을 분리해서 보는 것
class Animal3{
    void Sound(){
        System.out.println("...");
    }
}

class Wolf extends Animal3{
    void Sound(){
        System.out.println("oww");
    }
}

class Bear extends Animal3{
    void Sound(){
        System.out.println("arr");
    }
}

public class Class4 {
    public static void main(String[] args){
        Animal3 w = new Wolf();
        Animal3 b = new Bear();

        w.Sound();
        b.Sound();

        //다형성의 효과를 체감해보자
        Animal3[] animals = {
            new Wolf(),
            new Bear(),
            new Wolf()
        };

        for(Animal3 a : animals){
            a.Sound();
        }
        //배열 타입은 Animal3 하나뿐인데 내부에 wolf, bear 섞여 있어도 됨.
    }
}
