class factorial{
    public static void main(String[] args) {
        int a = 5, i=1, fact=1;
        while(i <= a){
            System.out.println("i=" +i+" fact="+fact);
            fact *= i;
            i++;
        }
        System.out.println("final=" + fact);
    }
}