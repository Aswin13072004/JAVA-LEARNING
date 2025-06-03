public class realcopy{
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4};
        int [] numbers2 = new int [numbers.length];
        for(int i = 0 ; i<numbers.length ; i++){
            numbers2 [i] =numbers [i] ;
        }
        for(int number : numbers){
            System.out.println(number);
        }
        for(int number : numbers2){
            System.out.println(number);
        }
        System.out.println("Values changed");
        numbers2 [1] = 10;
         for(int number : numbers){
            System.out.println(number);
        }
        for(int number : numbers2){
            System.out.println(number);
        }

    }
}
