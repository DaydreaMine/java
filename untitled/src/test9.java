public class test9 {
    public boolean isPalindrome(int x) {
        int a=x;
        int b = 0;
        int c = 0;
        if(x<0){
            return false;
        }else{
            while(x/10>0){
                b=x%10;
                x=x/10;
                c=b+c*10;
            }
            c=c*10+x;
            if(c==a){
                return true;
            }else{
                return false;
            }
        }
    }
}
