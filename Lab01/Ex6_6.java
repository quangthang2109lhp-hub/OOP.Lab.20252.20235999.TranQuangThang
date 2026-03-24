import java.util.Scanner;
public class Ex6_6{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of matrices : ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        double arr1[][]=new double[a][b];
        double arr2[][]=new double[a][b];
        System.out.println("Please enter the matrices 1 : ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextDouble();
            }
        }
        System.out.println("Please enter the matrices 2 : ");
          for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr2[i][j]=sc.nextDouble();
            }
        }
          double arr3[][]=new double[a][b];
          System.out.print("The sum matrices is : ");
            for(int i=0;i<a;i++)
        {
            System.out.print("\n");
            for(int j=0;j<b;j++)
            {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j]+" ");
            }
        }
            
    }
}