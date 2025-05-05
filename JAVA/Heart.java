public class Heart {

public static void main(String[]args){
for(int row =1;row<=9;row++) {
   for(int col =1;col<=9;col++){
    System.out.print("*\t");
for(int coli =1;coli<=row;coli++){
    if(col==1&&col==2) {
    System.out.print("*"); }
  else {
  System.out.println();
}
}
    } 
  System.out.println();
}
}
}

