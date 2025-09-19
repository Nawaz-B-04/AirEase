import java.util.*;
class matrixx
{
    int[][] ar3 = new int[2][2];
    int i,j;
    void addmatrix(int[][] ar1, int[][] ar2)
    {

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                ar3[i][j] = ar1[i][j] + ar2[i][j];

            }
        }
        System.out.println("The sum of matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(ar3[i][j]+"\t");

            }
            System.out.println();
        }

    }
    void mulmatrix(int[][]ar1, int[][]ar2)
    {
        int k;

        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                ar3[i][j]=0;
                for(k=0;k<2;k++)
                    ar3[i][j]+= ar1[i][k] * ar2[k][j];

            }
        }
        System.out.println("The product of matrix is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(ar3[i][j]+"\t");
            }
            System.out.println();

        }

    }
    void transpose1(int[][]ar1)
    {
        System.out.println("The transpose of matrix 1 is: ");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                ar3[i][j]=ar1[j][i];
                System.out.print(ar3[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transpose2(int[][]ar2)
    {
        System.out.println("The transpose of matrix 2 is:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                ar3[i][j]=ar2[j][i];
                System.out.print(ar3[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
public class matrixop
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int[][] ar1 = new int[2][2];
        int[][] ar2 = new int[2][2];
        System.out.println("Enter matrix 1:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrix 2:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                ar2[i][j]=sc.nextInt();
            }
        }
        matrixx ob=new matrixx();
        ob.addmatrix(ar1, ar2);
        ob.mulmatrix(ar1, ar2);
        ob.transpose1(ar1);
        ob.transpose2(ar2);
    }

}


