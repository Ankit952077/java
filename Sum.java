public class Sum{
    public static void main(String[] args) {

       float [] marks={12.5f,34.5f,35.4f,45.5f,67.4f,};
       float  sum =0;
       for ( float ele: marks) {
          sum = sum +ele ;

       }
       System.out.println(sum);
    }
}
