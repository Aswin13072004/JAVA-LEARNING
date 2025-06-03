class loopElseIF{
    public static void main(String[] args) {
        int value = 20;

        if (value < 10) {
            System.out.println("Value is less than 10");
        } else if (value < 20) {
            System.out.println("Value is less than 20 but greater than or equal to 10");
        } else if (value < 30) {
            System.out.println("Value is less than 30 but greater than or equal to 20");
        } else {
            System.out.println("Value is 30 or more");
        }
    }
}