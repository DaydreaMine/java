package Fourth_Week.Friday.Circulation;

import java.util.concurrent.TimeUnit;

public class Circulation implements Runnable {
    private int a = 0;

    @Override
    public void run() {
        while (a < 30) {
            try {
                if (Dielock.semaphore.tryAcquire(1, TimeUnit.MINUTES)) {
                    if (a % 3 == 0 && Thread.currentThread().getName().equals("吃饭")) {
                        System.out.println(Thread.currentThread().getName());
                        a++;
                    } else if (a % 3 == 1 && Thread.currentThread().getName().equals("睡觉")) {
                        System.out.println(Thread.currentThread().getName());
                        a++;
                    } else if (a % 3 == 2 && Thread.currentThread().getName().equals("打游戏")) {
                        System.out.println(Thread.currentThread().getName());
                        a++;
                    }
                }
                }catch(InterruptedException e){
                e.printStackTrace();
            }finally {
                Dielock.semaphore.release();
            }
        }
    }
}
