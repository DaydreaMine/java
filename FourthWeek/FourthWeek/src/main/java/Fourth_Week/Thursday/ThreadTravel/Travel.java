package Fourth_Week.Thursday.ThreadTravel;

public class Travel extends Thread {

    private static Integer num = 10;

    public Travel(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Travel.class) {
//                if (num > 0) {
//                    int num1 = (int) (Math.random()*(10)+10);
//                    System.out.println("第"+(11-num)+"为： "+Travel.currentThread().getName() +" 通过时间为："+ num1+"s");
//                    num--;
//                    Travel.class.notify();
//                } else {
//                    break;
//                }
//                try {
//                    Travel.class.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(Travel.currentThread().getName());
                Travel.currentThread().stop();
            }
        }
    }
}
