package exam;

public class Item {
    private String itemname;
    private double price;

    public Item(String name,double p){
        this.itemname = name;
        this.price = p;
    }

    public String getItemname(){
        return itemname;
    }

    public double getPrice() {
        return price;
    }

    public void displayitem(){
        System.out.println("Itemname:" +this.getItemname());
        System.out.println("Price:" +this.getPrice());
    }
}
