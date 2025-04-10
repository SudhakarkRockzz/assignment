public class Puzzle9 {
    public static void main(String[] args) {
        int temp = -10;

        if (temp < 0)
            System.out.println("Freezing");
        else if (temp < 100)
            System.out.println("Normal");
        else
            System.out.println("Boiling");
    }
}

