package Fourth_Week.Friday.Circulation;

public class Test {
    public static void main(String[] args) {
        Circulation circulation = new Circulation();
        Thread t1 = new Thread(circulation,"吃饭");
        Thread t2 = new Thread(circulation,"睡觉");
        Thread t3 = new Thread(circulation,"打游戏");

        t1.start();
        t2.start();
        t3.start();


    }
}