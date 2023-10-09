import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumber = sc.nextLine();

        int result = romanToInt(romanNumber);
        System.out.println("The equivalent integer is: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values.get(s.toUpperCase().charAt(i));

            if (currentValue >= previousValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            previousValue = currentValue;
        }

        return result;
    }
}
