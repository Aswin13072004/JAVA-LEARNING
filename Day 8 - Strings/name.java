class name {
    public static void main(String[] args) {
        String name = "Aswin Kumar C";
        String lastname = "";
        String [] namearray = name.split(" "); 
        System.out.println("Number of words = "+namearray.length);
        for(int i =1 ; i<namearray.length; i++){
            lastname = lastname +" "+namearray[i];
        }
        System.out.println("First Name:"+namearray[0]+" Lastname: "+lastname);

        
        char first = name.charAt(0);
        System.out.println(first);
    }
}
