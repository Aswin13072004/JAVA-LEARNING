class demo {
    public static void main(String args[]) {
        System.out.print("Hello World");
        System.out.print("Hello World");
        System.out.println(); // print empty line
        System.out.print("Hello World");
        System.out.println("Print in the next line");
        System.out.println(1);
        System.out.println(2.5);
        System.out.println('A');
        System.out.println(2 + 3);
        System.out.println(2 + 3 + "Hello World"); // 2 + 3 = 5, then "Hello World" is concatenated
        System.out.println("Hello World" + 2 + 3); // "Hello World" + 2 = "Hello World2", then "Hello World2" + 3 =
        System.out.println("Hello World" + (2 + 3)); // "Hello World" + 5 = "Hello World5"
        System.out.println("Hello World" + (2 + 3) + "Hello World" + 2 + 3);
        System.out.println("------------------");

        System.out.println("Line1\nLine2"); // \n is used to print in the next line
        System.out.println("Line1\tLine2"); // \t is used to print in the next line
        System.out.println("------------------");
        System.out.println("Line1\\Line2"); // \\ is used to print \
        System.out.println("Line1\"Line2"); // \" is used to print "
        System.out.println("She said, \"Hello!\"");

        System.out.println("------------------");
        System.out.println("\u2764"); // Unicode heart ❤
        System.out.println("Smile \uD83D\uDE00"); // 😀

        System.out.println("------------------");
        System.out.printf("Hello %d", 10); // %d is used to print integer
        System.out.println();
        System.out.printf("My name is %s and I am %d years old.\n", "Aswin", 20);

    }
}