package Fourth_Week.Friday.AtmThread;

import java.util.concurrent.TimeUnit;

public class Atm implements Runnable {


    private int money = 1000;
    private int A_money = 0;
    private int B_money = 0;

    @Override
    public void run() {
        while (true) {
           // System.out.println(Thread.currentThread().getName()+"进入循环");
            try {
               if (Dielock.A.tryAcquire(1, TimeUnit.MINUTES)) {
                    if (Thread.currentThread().getName().equals("A")&&100<=money) {
                        money = money - 100;
                        A_money += 100;
                        System.out.println(Thread.currentThread().getName() + "取了" + 100 + "元");
                        Thread.sleep(100);
                    } else if (Thread.currentThread().getName().equals("B")&&200<=money) {
                        money = money - 200;
                        B_money += 200;
                        System.out.println(Thread.currentThread().getName() + "取了" + 200 + "元");
                        Thread.sleep(100);
                    }else {
                        break;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Dielock.A.release();
            }
        }

        if (Thread.currentThread().getName().equals("A")) {
            System.out.println("A" + "一共取了" + A_money + "元");
        } else {
            System.out.println(Thread.currentThread().getName() + "一共取了" + B_money + "元");
        }
    }
}
