class demo{
    public static void main(String [] args){
        int [] numbers = new int[2];
        numbers [0]  = 1;
        numbers [1]  = 2;
        for(int number : numbers){
            System.out.println(number);
        }

        String [] items = {"Laptop","Cooler","Pens","Note"};
        System.out.println("First item = "+items[1]);
        for(String item : items){
            System.out.println(item);
        }
        System.out.println("Length = "+items.length);
    }
}