//import java.util.Scanner;
public class Method {
    static int sumRec(int n){
          if (n==1) {
            return 1;
          }
         return n+ sumRec(n-1);
    }
    public static void main(String[] args) {
     // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
       
       
      int c=sumRec(4);
      System.out.println(c);
      
    }
}
