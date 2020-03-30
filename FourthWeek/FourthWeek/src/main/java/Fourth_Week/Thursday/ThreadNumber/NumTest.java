package Fourth_Week.Thursday.ThreadNumber;

public class NumTest {
    public  static  void  main(String[] args){
        ThreadNum threadNum1 = new ThreadNum("A");
        ThreadNum threadNum2 = new ThreadNum("B");
        ThreadNum threadNum3 = new ThreadNum("C");
        ThreadNum threadNum4 = new ThreadNum("D");
        threadNum1.start();
        threadNum2.start();
        threadNum3.start();
        threadNum4.start();
    }
}
