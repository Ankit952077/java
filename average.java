

public class average {
    public static void main(String[] args) {
        int [] num={10,20,30,40,50}; 
         int sum=0;
         for (int ele : num) {
             sum=sum+ele;
         }
         System.out.println("The value is "+sum/num.length);
    }
}
