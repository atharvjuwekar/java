package coding_problems;

public class FindOccurrences {

    public static void main(String[] args) {
        String str = "Shree";
        
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Ocuurence of " + str.charAt(i) + " is " + findOccur(str, str.charAt(i)));
        }
    }

    public static int findOccur(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
