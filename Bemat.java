import java.util.*;
public class Bemat{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = 0,col= 0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1)
                {
                    row = i;
                    col = j;
                }
            }
        }
        int count = java.lang.Math.abs(row - 2) + java.lang.Math.abs(col - 2);
        System.out.println(count);
        sc.close();
    }
}