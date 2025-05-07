public class Puzzle10 {
    public static void main(String[] args) {
        boolean hot = true;
        boolean hasIceCream = false;

        if (hot && hasIceCream)
            System.out.println("Eat ice cream");
        else if (hot)
            System.out.println("Crave ice cream");
        else
            System.out.println("Stay cozy");
    }
}

