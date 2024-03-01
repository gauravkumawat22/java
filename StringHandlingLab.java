public class StringHandlingLab {
    public static void main(String[] args) {
        // Creating strings using literals
        String literalString1 = "Hello, ";
        String literalString2 = "world!";

        // Concatenating strings
        String result = literalString1 + literalString2;

        // Extracting characters at a specified index
        char charAtIndex = result.charAt(7);

        // Comparing strings for equality
        boolean areEqual = literalString1.equals("Hello, ");

        // Displaying the results
        System.out.println("Using literals:");
        System.out.println(literalString1);
        System.out.println(literalString2);
        System.out.println("\nConcatenated String:");
        System.out.println(result);
        System.out.println("\nCharacter at index 7: " + charAtIndex);
        System.out.println("\nAre constructorString1 and literalString1 equal? " + areEqual);
    }
}
