class contTwoSum{
    public static void main(String[] args) {
        int [] array = {2,3,11,4,5,8};
        int value = 0, largest = 0 ;
        // for(int i =0 ; i<array.length ; i++){
        //     for(int j=i+1 ; j<array.length; j++){
        //         System.out.println(i +" " + j);
        //         value = array[i]+array[j];
        //         System.out.println(value);
        //         if (largest < value){
        //             largest = value;
        //         }
        //         break;
        //     }
        // }
        // System.out.println("Largest = " + largest);
        for(int i=0; i<array.length-1; i++){
            value = array[i]+array[i+1];
            System.out.println(value);
            if(largest<value){
                largest = value;
            }
        }
        System.out.println("Largest"+largest);
    }
}
