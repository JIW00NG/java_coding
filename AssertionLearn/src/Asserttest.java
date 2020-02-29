import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Asserttest {
    public static void main(String[] args) {
        int a;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.println("점수를 입력하세요");
            a=Integer.parseInt(in.readLine());
            assert (a<100&&a>=0):"올바르지 못한 점수를 입력하셨습니다.";
            System.out.println("올바른 점수를 입력하셨습니다.");
        }
        catch(Exception e){
            System.out.println("예외 발생");
        }
    }
}
