import java.util.*;
public class Bg{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        Set<Character> st = new HashSet<>();
        for(int i=0;i<len;i++)
        {
            st.add(s.charAt(i));
        }
        if(st.size()%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}