import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        //for
        System.out.print("별피라미드 높이 입력: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for(int i = 0; i < h; i++){
            for(int j = 0; j < h - i - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

        //while
        int i = 0;
        while (i < 10){
            System.out.printf("%d\n",i);
            i++;
        }

        //do-while
        int j = 11;
        do{
            System.out.printf("%d",j);
            j++;
        }while(j < 10);
    }
}
