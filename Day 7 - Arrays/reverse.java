class reverse{
    public static void main(String [] args){
        int  [] numbers = {1,2,3,4,5};
        int newnumbers []= new int [numbers.length];
        for(int i =0 ; i<numbers.length ; i++){
            newnumbers[i] = numbers[numbers.length - 1 - i];
        }
        for(int newnum : newnumbers){
            System.out.println(newnum);
        }
    }
}