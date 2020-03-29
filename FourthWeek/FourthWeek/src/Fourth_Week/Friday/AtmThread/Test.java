package Fourth_Week.Friday.AtmThread;

public class Test {
    public static void main(String[] args) {
         int money = 1000;
        Atm atm = new Atm();
        Thread t1 = new Thread(atm,"A");
        Thread t2 = new Thread(atm,"B");
        t1.start();
        t2.start();
    }
}