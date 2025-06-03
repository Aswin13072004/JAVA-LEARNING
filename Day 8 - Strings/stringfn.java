public class stringfn {
    public static void main(String[] args) {
        // Example of String methods in Java

        String str = "Hello, World!";

        // 1. Length of the string
        int length = str.length();
        System.out.println("Length: " + length);

        // 2. Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);

        // 3. Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);

        // 4. Substring
        String substring = str.substring(7, 12); // "World"
        System.out.println("Substring: " + substring);

        // 5. Replace characters
        String replacedStr = str.replace('o', '0'); // Replace 'o' with '0'
        System.out.println("Replaced: " + replacedStr);

        // 6. Split the string
        String[] words = str.split(", "); // Split by comma and space
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }
        // 6.1. Check if two strings are equal
        String anotherStr = "Hello, World!";
        boolean isEqual = str.equals(anotherStr);
        System.out.println("Equals: " + isEqual);

        // 7. Check if string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
    }
}
