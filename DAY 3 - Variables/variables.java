class variables{
    static int a = 10; // static variable
    int b = 20; // 'b' is an instance variable or non-static variable
    void method(){
        int c = 20; // 'c' is a local variable
        System.out.println("local "+c);
    }
    public static void main(String [] args){
        System.out.println("static "+a);
        //System.out.println(b); This will cause an error because 'b' is not static - create object
        variables obj  = new variables();
        System.out.println("Non-static / instance " + obj.b);
        //method(); this also causes an error because 'method' is not static - call through object
        obj.method();

    }
}