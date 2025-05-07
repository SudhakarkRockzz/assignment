public class Train {
    public static void main(String[] args) {
        int no = 1;
        while(no <= 100000) {
            if(no % 21 == 0 && no % 43 == 0) {
                System.out.println(no*3);
break;
            }
            no += 1; 

        }
    }
}
