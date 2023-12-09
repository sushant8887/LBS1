package SetB;

public class AdditionOfTwoMatrices{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3}};    
int b[][]={{1,1,1},{1,1,1}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[2][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<2;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  