public class Pattern1 {
    public static void main(String[] args) {
        final int SIZE = 9; // Constant for grid size
        
        for(int row = 1; row <= SIZE; row++) {
            for(int col = 1; col <= SIZE; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
