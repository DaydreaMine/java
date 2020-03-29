package Fourth_Week.Friday.Thread;

public class deleteThread implements Runnable {
    private MyThread myThread;

    public deleteThread(MyThread myThread) {
        this.myThread = myThread;
    }

    @Override
    public void run() {
        while (true) {
           synchronized (myThread) {
                if (!myThread.flag) {
                    try {
                        myThread.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    myThread.i--;
                    System.out.println(Thread.currentThread().getName()+myThread.i);
                    myThread.flag = !myThread.flag;
                    myThread.notify();
                }
            }
        }
    }
}
