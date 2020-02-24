//입력된 년도가 윤년인지 아닌 지 판별해주는 프로그램을 작성해보세요.
//(단, 윤년은 4의 배수이고 100배수는 아니거나 400의 배수이면 윤년)
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        scanner.close();

        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(year+"년은 윤년입니다.");
        }
        else{
            System.out.println(year+"년은 윤년이 아닙니다.");
        }
    }
}
