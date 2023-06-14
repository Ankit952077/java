

public class materices_sum {
    public static void main(String[] args) {
        int [][] mate1={{1,2,3},
                       {4,5,6}};
       int [][] mate2={{2,5,6},
                        {2,4,1}};
     int [][] result={{0,0,0},  
                     {0,0,0}};
 
    for (int i = 0; i <mate1.length; i++) {
        for (int j = 0; j <mate1[i].length; j++) {
            System.out.format("setting value is i=%d and j=%d\n",i,j);
            result[i][j]=mate1[i][j] + mate2[i][j];
            
        }
    }
    
    for (int i = 0; i <mate1.length; i++) {
        for (int j = 0; j <mate1[i].length; j++) {
            System.out.print(result[i][j] +" ");
            result[i][j]=mate1[i][j] + mate2[i][j]; 
 
    }
    System.out.println(" ");
    }
    

}
}