//import java.util.Scanner;
public class Method {
    public static void Patteren(int n){
          for (int i = 0; i<n; i++) {
            for (int j = 0; j<i+1; j++) {
              System.out.print("*");
            }
           System.out.println();
          }
    }
    public static void main(String[] args) {
     // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
       
       
      Patteren(4);
      
    }
}
