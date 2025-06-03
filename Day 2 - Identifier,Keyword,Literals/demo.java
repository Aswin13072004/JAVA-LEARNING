// This is a basic Java program demonstrating:
// 1. Keywords - int, boolean, public, class, static, void
// 2. Identifiers - StudentInfo, age, name, main, args
// 3. Literals - 	20, "Ananya", 'A', true, 88.5

class demo { // 'public' and 'class' are keywords, 'StudentInfo' is an identifier (class name)
    
    // 'main' is the identifier for the method, 'void', 'public', 'static' are keywords
    public static void main(String[] args) {

        // ------- Variable Declarations -------
        int age = 20;              // 'int' is a keyword, 'age' is an identifier, 20 is a literal
        String name = "Ananya";    // 'String' is a class (non-primitive), 'name' is an identifier, "Ananya" is a literal
        char grade = 'A';          // 'char' is a keyword, 'grade' is identifier, 'A' is a literal
        boolean passed = true;     // 'boolean' is a keyword, 'passed' is identifier, 'true' is a literal
        double marks = 88.5;       // 'double' is a keyword, 'marks' is identifier, 88.5 is a literal

        // ------- Output -------
        System.out.println("Student Details:"); // 'System' is a predefined class, 'out' is an object, 'println' is a method (identifier)

        System.out.println("Name: " + name);    // String literal + identifier
        System.out.println("Age: " + age);      // Integer literal + identifier
        System.out.println("Grade: " + grade);  // Character literal + identifier
        System.out.println("Marks: " + marks);  // Floating point literal + identifier
        System.out.println("Passed: " + passed); // Boolean literal + identifier

        // Example of invalid identifier (commented out):
        // int class = 5; //  Error: 'class' is a keyword, cannot be used as a variable name
    }
}
