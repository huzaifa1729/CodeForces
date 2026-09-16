import java.util.*;
public class Word2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int upperCount = 0;
        int lowerCount = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>=65 && c<=90)
            {
                upperCount++;
            }
            else if(c>=97 && c<=122)
            {
                lowerCount++;
            }
        }
        if(upperCount>lowerCount)
        {
            System.out.println(s.toUpperCase());
        }
        else
        {
            System.out.println(s.toLowerCase());
        }
     }
}