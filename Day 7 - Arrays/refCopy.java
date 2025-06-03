class refCopy{
    public static void main(String[] args) {
        int [] numbers = {1,2,3};
        int [] numbers2 = numbers;
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        for(int i = 0 ; i < numbers2.length ; i++){
            System.out.println(numbers2[i]);
        }
        numbers2 [1] = 100; 
        System.out.println("Value changed");
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        for(int i = 0 ; i < numbers2.length ; i++){
            System.out.println(numbers2[i]);
        }
    }
}