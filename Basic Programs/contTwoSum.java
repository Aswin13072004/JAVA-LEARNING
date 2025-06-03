class contTwoSum{
    public static void main(String[] args) {
        int [] array = {12, 31, 10, 6, 40};
        int value = 0, largest = 0 ;
        for(int i =0 ; i<array.length ; i++){
            for(int j=i+1 ; j<array.length; j++){
                System.out.println(i +" " + j);
                value = array[i]+array[j];
                System.out.println(value);
                if (largest < value){
                    largest = value;
                }
                break;
            }
        }
        System.out.println("Largest = " + largest);
    }
}
