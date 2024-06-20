package Basis;

class variable {
    public static void main(String[] args) {
        // System.out.println("Hello world");    

        //basis variable
        String typeString = "type is string";
        int typeInt = 12;
        final int costTypeInt = 12; //don't have to change value 
        float typeFloat = 12.1f;
        char typeChar = '1';
        boolean typeboolean = true;

        //convert 
        float a = 12.4f;
        int b = (int) a; //12
       

        //function of string
        String examString = "Hello everybody";
        int len = examString.length(); //15
        examString = examString.toUpperCase(); 
        int index = examString.indexOf("every"); //-1
        String specString = "I can add \" \" in string";
        
        //
        System.out.println(10>9); // true

        //if-else
        int age = 18;
        if(age > 18){
            System.out.println("age greater than 18");
        }
        else if (age == 18){
            System.out.println("age is equal 18");
        }
        else{
            System.out.println("age more less than 18");
        }

        String resutlt = age == 18 ? "age equal 18":"age don't equal 18";
        System.out.println(resutlt);

        //loop
        while(1 > 0){
            System.out.println("1 > 0");
            break;
        }
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        //foreach
        String[] animal = {"cat","dog","chicken"};
        for (String nameAnimal : animal) {
            System.out.println(nameAnimal);
        }
        
    }    
}