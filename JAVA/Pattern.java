public class Pattern {

public static void main(String[]args) {
 Pattern s = new Pattern();
for(int row=5;row>=1;row--) {

for(int col = 1;col<row ;col++) {
System.out.print(row-col+1);
}
System.out.println(row);
}
}
}
