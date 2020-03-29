package Fourth_Week.Friday.Thread;


public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        addThread add = new addThread(myThread);
        deleteThread del = new deleteThread(myThread);

        Thread A = new Thread(add,"a");
        Thread B = new Thread(add,"b");
        Thread C = new Thread(del,"c");
        Thread D = new Thread(del,"d");

        A.start();
        B.start();
        C.start();
        D.start();

    }
}
