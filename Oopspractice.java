


class Cylinder{
    private int Radius;
    private int Height;
   
 public int getRadius(){
    return Radius;
 }
 public void setRadius(int Radius){
     this.Radius=Radius;
 }
 public int getHeight(){
    return Height;
 }  
 public void setHeight(int Height) {
    this.Height=Height;
 }  
} 


public class Oopspractice {
  public static void main(String[] args) {
     Cylinder mCylinder=new Cylinder();
      mCylinder.setRadius(20);
      mCylinder.setHeight(23);
  System.out.println(mCylinder.getHeight());
  System.out.println(mCylinder.getRadius());

  }    
}
