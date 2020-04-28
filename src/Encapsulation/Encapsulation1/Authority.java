package Encapsulation.Encapsulation1;

public class Authority {
    private String name;
    private String email;
    private String contact_number;
    private String age;
    private  String nationality;

    public void setvalue(String n,String e,String c,String a,String n2){
        this.name = n;
        this.email = e;
        this.contact_number = c;
        this.age = a;
        this.nationality = n2;

    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getContact_number(){
        return this.contact_number;
    }
    public String getAge(){
        return this.age;
    }
    public String getNationality(){
        return this.nationality;
    }
}
