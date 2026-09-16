import java.util.Scanner;
public class Round{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=arr[x-1]&&arr[i]>0)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}   