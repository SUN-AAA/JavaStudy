import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //if - else if - else
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b){
            System.out.printf("a < b\n");
        }
        else if (a > b){
            System.out.printf("a > b\n");
        }
        else {
            System.out.printf("a == b\n");
        }
        sc.close();

        //switch-case
        int c = 3;
        switch (c){
            case 1:
                System.out.printf("%d", 1);
                break;
            case 2:
                System.out.printf("%d", 2);
                break;
            case 3:
                System.out.printf("%d", 3);
                break;
            case 4:
                System.out.printf("%d", 4);
                break;
        }
    }
}
