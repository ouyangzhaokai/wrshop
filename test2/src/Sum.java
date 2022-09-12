import java.util.Scanner;

public class Sum {
    Scanner input = new Scanner(System.in);
    public static void sum(int num[]) {
        int maxSum = 0;
        for(int i = 0;i < num.length;i++){
            int sum1 = 0;
            for(int j = i;j < num.length;j++){
                sum1+=num[j];
                if(sum1>maxSum){
                    maxSum=sum1;
                }
            }
        }
        System.out.println("子数组之和的最大值为:"+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1,-2,3,5,-1};
        int num1[] = {1,-2,3,-8,5,1};
        int num2[] = {1,-2,3,-2,5,1};
        sum(num);
        sum(num1);
        sum(num2);
    }
}
