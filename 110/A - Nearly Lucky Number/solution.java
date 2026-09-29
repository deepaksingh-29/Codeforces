import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        int count = 0;
 
        for (char ch : s.toCharArray()) {
            if (ch == '4' || ch == '7') {
                count++;
            }
        }
 
        if (count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}