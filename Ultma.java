import java.util.*;
public class Ultma{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String m = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)==m.charAt(i))
            {
                sb.append('0');
            }
            else
            {
                sb.append('1');
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}