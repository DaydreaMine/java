package Fourth_Week.Thursday.ThreadNumber;

public class ThreadNum extends Thread {

    private static int number = 200;

    public ThreadNum(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized (ThreadNum.class) {
                if (number < 401) {
                    if (number % 2 == 0) {
                        System.out.println(number++);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "------" + (number++));
                    }
                } else {
                    break;
                }
                try {
                    ThreadNum.sleep(233);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}