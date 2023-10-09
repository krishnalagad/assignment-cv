public class Problem3 {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(input);

        if (isPangram)
            System.out.println("The input string is a pangram.");
        else
            System.out.println("The input string is not a pangram.");
    }

    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];

        for (char c : s.toCharArray()) {
            char lowercaseChar = Character.toLowerCase(c);

            if ('a' <= lowercaseChar && lowercaseChar <= 'z')
                seen[lowercaseChar - 'a'] = true;
        }

        for (boolean letterSeen : seen)
            if (!letterSeen)
                return false;
        return true;
    }
}
