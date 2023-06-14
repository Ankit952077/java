

public class find {
    public static void main(String[] args) {
        int [] num={10,20,21,23,34,24}; 
        int findnum=20;
          boolean isinarray=false;

        for (int Element : num) {
            if (findnum==Element) {
                isinarray=true;
                break;
           }
        }
            if (isinarray) {
                System.out.println("present in array");
            }
            else
            System.out.println( " not present in array");
    }
}
