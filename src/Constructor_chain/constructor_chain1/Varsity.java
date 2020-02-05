package Constructor_chain.constructor_chain1;
import java.util.Date;

public class Varsity {
    private String var_name;
    private String address;
    private Date createdate;

    public Varsity(){
        this.createdate = new Date();
        this.address = "dhaka";
        this.var_name = "nmcnc";
    }

    public Varsity(String var_name){
        this();
        this.var_name = var_name;
    }

    public Varsity(String var_name,String address){
        this();
        this.var_name = var_name;
        this.address = address;
    }

    public void display(){
        System.out.println("Varsity: " +var_name+ "Address: " +address+ "date: " +createdate);
    }



}
