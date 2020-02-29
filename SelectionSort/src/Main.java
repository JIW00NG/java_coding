public class Main {
    public static void main(String[] args) {
        int test[]={2,3,4,5,1};
        int i,j,temp;

        System.out.println("정렬 전");

        for(i=0;i<5;i++){
            System.out.println((i+1)+"번째 데이터"+test[i]);
        }

        for(i=0;i<4;i++){
            for(j=i+1;j<5;j++){
                if(test[i]<test[j]){
                    temp=test[i];
                    test[i]=test[j];
                    test[j]=temp;
                }
            }
        }

        System.out.println("==========");
        System.out.println("==========");
        System.out.println("정렬후");

        for(i=0;i<5;i++){
            System.out.println((i+1)+"번째 데이터"+test[i]);
        }
    }
}
