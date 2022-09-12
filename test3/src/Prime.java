public class Prime {
    public static void main(String[] args) {
        int i,j,flag=0;
        for(i = 1;i <= 20000;i++){
            for(j = 2;j <= i;j++ ){
                if(i%j==0) break;
            }
            if(i==1 || i==j){
                flag++;
                if(flag < 5)
                    System.out.print(i+" ");
                else{
                    flag=0;
                    System.out.println(i+" ");
                }
            }
        }
    }
}
