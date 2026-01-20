//예외처리

public class ExeptionHandling {
    public static void main(String[] args){
        //try-catch-finally
        int a = 10;
        int b = 0;

        try{
            int c = a / b;
            System.out.println("result = " + c);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally{
            System.out.println("finally는 예외 여부와 상관 없이 실행");
        }

        //여러 catch + 예외 정보 출력
        String s = null;

        try{
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("null 참조입니다.");
            System.out.println("message : " + e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("message : " + e.getMessage());
            System.out.println("기타 예외 처리");
        }
    }
}
