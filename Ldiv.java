import java.util.*;
public class Ldiv{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {7, 4, 47, 74, 444, 447, 474, 744, 777, 774, 747, 477};
        if(n==0) System.out.println("N0");
        else
        {
            boolean flag = false;
            for(int i=0;i<arr.length;i++)
            {
                if(n%arr[i]==0)
                {
                    flag = true;
                    break;
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}