class Task14 {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            arr[i][0] = i + 1;
            for (int j = 0; j < 9; j++) {
                arr[0][j] = j + 1;
                arr[i][j] = arr[i][0] * arr[0][j];
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}