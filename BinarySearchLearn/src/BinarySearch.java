import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
    public static void main(String[] args) {
        int data[]={11,16,21,26,35,39,47};
        int key=0,count=0;
        int low=0;
        int high=data.length-1;
        int middle;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("찾고자 하는 수를 입력하세요: ");

        try{
            key=Integer.parseInt(in.readLine());
        }catch(Exception e){
            System.out.println("입력 오류");
        }

        while(true){
            if(low>high){
                System.out.println("찾는 값이 없어");
                break;
            }
            middle=(low+high)/2;
            count++;
            System.out.println("비교 값: "+data[middle]);

            if(data[middle]==key){
                System.out.println(middle+1+"번째 위치 검색횟수+ "+count+"번");
                break;
            }
            if(key>data[middle]){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
    }
}
