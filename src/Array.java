import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //배열의 선언 & 생성
        int[] arr1;
        arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};

        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++){
            arr2[i] = i * 10;
        }

        //배열의 출력
        for (int i = 0; i < arr1.length; i++){
            System.out.printf("%d ",arr1[i]);
        }
        System.out.println();

        for(int i = 0; i < arr2.length; i++){
            System.out.printf("%d ", arr2[i]);
        }
        System.out.println();

        //String 배열
        String[] name = new String[3];
        name[0] = "Java";
        name[1] = "Python";
        name[2] = "C";

        for (int i = 0; i < name.length; i++){
            System.out.printf("%s\n",name[i]);
        }

        String[] name2 = new String[]{"Java", "Python", "C"};
        for (int i = 0; i < name2.length; i++){
            System.out.printf("%s\n",name2[i]);
        }

        //다차원 배열
        int[][] arr00 = {
                {1,2,3},
                {4,5,6}
        };

        for(int i = 0; i < arr00.length; i++){
            for(int j = 0; j < arr00[i].length; j++){
                System.out.printf("%d ",arr00[i][j]);
            }
            System.out.println();
        }
    }
}
