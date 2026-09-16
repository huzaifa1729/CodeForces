import java.util.Scanner;
public class Ptystr{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int count = 0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.toLowerCase(a.charAt(i))<Character.toLowerCase(b.charAt(i)))
            {
                count = -1;
                break;
            }
            else if(Character.toLowerCase(a.charAt(i))>Character.toLowerCase(b.charAt(i)))
            {
                count = 1;
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}