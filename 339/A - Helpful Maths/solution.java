import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        ArrayList<Character> nums = new ArrayList<>();
 
        for (char c : s.toCharArray()) {
            if (c != '+') {
                nums.add(c);
            }
        }
 
        Collections.sort(nums);
 
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if (i != nums.size() - 1) {
                System.out.print("+");
            }
        }
    }
}