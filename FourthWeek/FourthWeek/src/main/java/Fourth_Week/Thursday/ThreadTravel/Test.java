package Fourth_Week.Thursday.ThreadTravel;

public class Test {
    public  static void  main(String[] args) throws InterruptedException {

        Travel travel1 = new Travel("A1");
        Travel travel2 = new Travel("A2");
        Travel travel3 = new Travel("A3");
        Travel travel4 = new Travel("A4");
        Travel travel5 = new Travel("A5");
        Travel travel6 = new Travel("A6");
        Travel travel7 = new Travel("A7");
        Travel travel8 = new Travel("A8");
        Travel travel9 = new Travel("A9");
        Travel travel10 = new Travel("A10");

        travel1.start();
        travel2.start();
        travel3.start();
        travel4.start();
        travel5.start();
        travel6.start();
        travel7.start();
        travel8.start();
        travel9.start();
        travel10.start();

    }
}
