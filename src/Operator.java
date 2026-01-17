import java.util.Scanner;

public class Operator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d\n",a,b,(a+b));
        System.out.printf("%d - %d = %d\n",a,b,(a-b));
        System.out.printf("%d / %d = %d\n",a,b,(a/b));
        System.out.printf("%d %% %d = %d\n",a, b, (a%b));
        System.out.printf("%d < %d = %b\n",a,b,(a<b));

        System.out.printf("true && true = %b\n", true && true);
        System.out.printf("false || true = %b\n", false || true);
        System.out.printf("!false = %b\n",!false);

        sc.close();
    }
}