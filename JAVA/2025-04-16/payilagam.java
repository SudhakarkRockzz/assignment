public class Payilagam {  
    String course;  
    int age;  
    String address;  

    public static void main(String[] args) {  
        Payilagam ram = new Payilagam("Java", 25, "Chennai");  
        Payilagam sam = new Payilagam();  
        

        sam.displayInfo();  
    }  

    public Payilagam(String course, int age, String address) {  
        course = course;  
        age = age;  
        address = address;  
    }  

    public Payilagam() {  
        course = "Unknown";  
        age = 0;  
        address = "Not Specified";  
    }  

    public void displayInfo() {  
        System.out.println("Course: " + course);  
        System.out.println("Age: " + age);  
        System.out.println("Address: " + address);  
    }  
}  
}