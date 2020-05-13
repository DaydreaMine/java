public class test70 {
    public int climbStairs(int n) {
        int num=0;
        int a=1;
        int b=2;
        if(n==1){
            return a;
        }
        if(n==2){
            return b;
        }
        for(int i=3;i<=n;i++){
            int c = a+b;
            num=c;
            a=b;
            b=c;
        }
        return num;
    }
}
