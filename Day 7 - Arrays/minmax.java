class minmax {
    public static void main(String[] args) {
        int [] arr = {3, 5, 1, 8, 2}; // Array of integers
        int max =arr[0] ,min=arr[0];
        for(int i= 0 ; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max = "+max + " min = "+ min);
    }    
}
