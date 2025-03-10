/*
6. Write a program to display character and string 
literals along with their ASCII values.
*/

public class CharacterStringASCII {
    public static void main(String[] args) {
        // Character literals
        char char1 = 'A';
        char char2 = 'Z';
        char char3 = 'a';
        char char4 = 'z';
        char char5 = '0'; // Numeric character

        // Displaying character literals and their ASCII values
        System.out.println("Character Literals and ASCII Values:");
        System.out.println(char1 + " -> ASCII: " + (int) char1);
        System.out.println(char2 + " -> ASCII: " + (int) char2);
        System.out.println(char3 + " -> ASCII: " + (int) char3);
        System.out.println(char4 + " -> ASCII: " + (int) char4);
        System.out.println(char5 + " -> ASCII: " + (int) char5);

        // String literal
        String str = "Hello";

        // Displaying string literals and ASCII values of each character
        System.out.println("\nString Literal: \"" + str + "\"");
        System.out.println("Characters and their ASCII values:");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " -> ASCII: " + (int) str.charAt(i));
        }
    }
}
