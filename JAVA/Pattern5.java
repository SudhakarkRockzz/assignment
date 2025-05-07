public class Pattern5 {
    public static void main(String[] args) {
        int rows = 5;
        int start = 5;
        int step = 1;

        for (int i = 0; i < rows; i++) {
            int num = start;
            for (int j = 0; j < rows - i; j++) {
                System.out.print(num + " ");
                num -= step;
            }
            System.out.println();
            start += 3;  // increase starting number by 3 each row
            step++;      // increase step by 1 each row
        }
    }
}

