import java.util.*;
public class Math{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\+");
        Arrays.sort(arr);
        String str = String.join("+",arr);
        System.out.println(str);
        sc.close();
    }
}