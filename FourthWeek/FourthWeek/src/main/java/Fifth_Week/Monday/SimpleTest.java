package Fifth_Week.Monday;

public class SimpleTest {

    private static SimpleTest simpleTest = new SimpleTest();

    private SimpleTest(){};

    public static SimpleTest getInstance(){
        return simpleTest;
    }
}

class test{
    public static void main(String[] args) {
        System.out.println(SimpleTest.getInstance().hashCode());
    }
}
