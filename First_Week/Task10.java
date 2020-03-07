//4.找出能被5或6整除，但不能被两者同时整除的数
class Task10 {
    public static void main(String[] args) {
        for (int i = 1; i < 1111111; i++) {
            if ((i % 5 == 0 || i % 6 == 0) && (i % 30 != 0)) {
                System.out.println(i);
            }
        }
    }
}