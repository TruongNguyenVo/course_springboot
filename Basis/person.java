package Basis;

public class person {
    private int contactID;
    private String first_name;
    private String last_name;

    public person(int contactID, String first_name, String last_name){
        this.contactID = contactID;
        this.first_name = first_name;
        this.last_name = last_name;
    }
    @Override
    public String toString(){
        return "person{"+
                "ContactID: " + this.contactID + "," +
                "FistName: " + this.first_name + "," +
                "LastName: " + this.last_name +
                "}";
    }
    
}
