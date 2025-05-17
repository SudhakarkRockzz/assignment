public abstract class Smartphone {

    // Abstract methods
    public abstract int call(int seconds);
    public abstract void sendMessage();
    public abstract void receiveCall();

    // Non-abstract method
    public void browse() {
        System.out.println("SmartPhone browsing");
    }

    // Constructor
    public Smartphone() {
        System.out.println("Smartphone under development");
    }
}

