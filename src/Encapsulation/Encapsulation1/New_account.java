package Encapsulation.Encapsulation1;

public class New_account {
    public static void main(String[] args) {
        Authority a1 = new Authority();

        a1.setvalue("liya","@gmail.com","99999999","41","bangladeshi");

        System.out.println("Name: " +a1.getName());
        System.out.println("Email: " +a1.getEmail());
        System.out.println("ContactNumber: " +a1.getContact_number());
        System.out.println("Age: " +a1.getAge());
        System.out.println("Nationality: " +a1.getNationality());
    }
}
