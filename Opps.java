import javax.sound.midi.Soundbank;

class Employee{
    int salary;
    String name;
     public int getsalary() {
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n) {
         name =n;

 
    }
}
class Callphone{
  public void Call(){
    System.out.println("Call Friend.......");

  }
  public void viberate() {
    System.out.println("Vibeerate........");

  }
  public void ring() {
    System.out.println("ringing............");
  }

}
   class Squre{
    int side;
    public int area(){
        return side*side;
    }
    public int parameter() {
        return 4*side;
    }
   }
   class Tommy{
     public void hit() {
        System.out.println("hitting the enemy....");

     }
     public void run() {
        System.out.println("running from the enemy");
     }
     public void fire() {
        System.out.println("firing on the enemy");
     }
   }
    public class Opps {
    public static void main(String[] args) {
        
    Employee ankit=new Employee();
    ankit.salary=122;
    ankit.setname("danavji");

    System.out.println(ankit.getsalary());
    System.out.println(ankit.getname());
    System.out.println("\nn ");


     
    Callphone asus=new Callphone();
       
       asus.viberate();
       asus.ring();
       asus.Call();
       System.out.println("\n");
    
     Squre sq=new Squre(); 
      sq.side =3;
     System.out.println(sq.area());
     System.out.println(sq.parameter());
     System.out.println("\n");
      
     Tommy player=new Tommy();
     player.hit();
     player.run();
     player.fire();
    
    
    
    
    }
    }
