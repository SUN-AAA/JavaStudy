import java.util.Scanner; //입력을 받기 위해 추가

public class Variable {
    public static void main(String[] args){
        //변수 선언과 초기화
        int a = 1;
        int b = 2;
        int temp;
        temp = a;
        a = b;
        b = temp;

        //변수의 타입
        //기본형 = 실제 값 저장, 참조형 = 주소 저장
        //기본형 = boolean, char, byte, short, int, long, float, double
        boolean bool = false;
        char ch = 'A';
        byte bit = 8;
        short sh = 1;
        int i = 1;
        long l = 12345678;
        float fl = 3.14F;
        double d = 3.141592;

        //상수
        final float constant_f = 3.14F;
        final long constant_l = 12345678L;
        final double constant_d = 3.141592D;

        //문자, 문자열 리터럴
        //char ch1 = ''; -> error
        char ch1 = ' ';
        char ch2 = 'a';
        String name1 = "";
        String name2 = "Java";
        String name3 = "Ja" + "va";
        String name4 = "Ja" + 8.0;

        //형식화된 출력 - printf()
        //형식지정자 : %b (boolean), %d (10진수), %o (8진수), %x %X (16진수), %f (10진수 float), %e %E (지수 형태 표현), %c (문자), %s (문자열)
        System.out.printf("name2 = %s\n",name2);
        System.out.printf("a = %d b = %d\n", a,b);
        System.out.printf("ch2 = %c\n",ch2);
        System.out.printf("name4 = %s\n",name4);

        //화면에서 입력받기 - Scanner
        Scanner sc = new Scanner(System.in);
        int in_a = sc.nextInt();
        int in_b = sc.nextInt();
        System.out.printf("%d", in_a+in_b);
        sc.close();
    }
}