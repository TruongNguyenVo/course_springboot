package Basis;

public class Second {
    //fields
    private String name;
    //property
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //constructor
    public Second(String name){
        this.name = name;
    }
    public Second(){
        this.name = "unknow";
    }

    //method
    public String sayHello(){
        return "hello," + this.name;
    }
}
