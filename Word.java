import java.util.*;
public class Word{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.charAt(0)>='a' && s.charAt(0)<='z')
        {
            s = Character.toUpperCase(s.charAt(0))+s.substring(1);
        }
        System.out.println(s);
        sc.close();
    }
}