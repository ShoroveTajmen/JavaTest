package exam;
import java.util.*;

public class Customer extends user {
    private String name;
    private String email;

    public Customer(String n,String e){
        super("rifat","*****");
        this.name = n;
        this.email = e;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void buy(ArrayList<Item>i){
        for(Item I : i){
            I.displayitem();
        }
    }

    public static void main(String[] args) {
        Customer c = new Customer("rifat","@gmail.com");
        System.out.println("print details:");



        System.out.println("cusname:" +c.getName());
        System.out.println("cusmail:" +c.getEmail());

        Item p1 = new Item("fruit",150.00);
        Item p2 = new Item ("veg",200.00);

        ArrayList<Item>i = new ArrayList<>();
        i.add(p1);
        i.add(p2);

        c.buy(i);


    }


}
