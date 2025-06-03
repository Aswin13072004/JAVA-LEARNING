class swapingNumbers{
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swaping a "+a+"b "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after swaping a "+a+"b "+b);

        //method 2
        int c= 10;
        int d = 20;
        c = c + d;
        d = c - d;
        c = c - d;
        System.out.println( "c" + c + "d" + d);
    }
}