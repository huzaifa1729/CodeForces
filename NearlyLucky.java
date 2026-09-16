import java.util.*;
public class NearlyLucky{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        long rem = 0;
        while(n!=0)
        {
            rem = n%10;
            if(rem==4 || rem==7)
                count++;
            n = n/10;
        }
        boolean isLucky = count !=0;
        int temp = count;
        while(temp!=0)
        {
            int d = temp%10;
            if(d!=4 && d!=7)
                isLucky = false;
            temp = temp/10;
        }
        System.out.println(isLucky?"YES":"NO");
        sc.close();
    }
}