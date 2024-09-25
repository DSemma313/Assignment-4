public class ReverseString {
    public static String reverse(String input){
        StringBuilder reversedString = new StringBuilder(input);
        
        return reversedString.reverse().toString();


    }


    public static void main(String[] args) {
        String input = "Welcome";

        String output = reverse(input);
        System.err.println(output);
    }
}