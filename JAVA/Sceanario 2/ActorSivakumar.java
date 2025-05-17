public class ActorSivakumar implements Actor {
static String address = "Coimbatore";
public static void main(String[]args){
 ActorSivakumar as = new ActorSivakumar(65, "Audi Car");
 Actor ac = new ActorSivakumar();
 System.out.println(ac.address);
System.out.println(as.address);
}
public  ActorSivakumar(int age , String car) {

}
public  ActorSivakumar(){
}
public void act() {
System.out.println("Hello");
}
public void  dance(){
System.out.println("Rock");
}
public void sing(){
System.out.println("GV");
}
public void speaking(){

}

}
