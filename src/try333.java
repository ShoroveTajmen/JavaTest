import java.util.Scanner;

public class try333 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////
////        System.out.println("completed msc");
////        String str1 = sc.nextLine();
////
////        System.out.println("fluent in englis");
////        String str2 = sc.nextLine();
////
////        if(str1 == "yes" && str2 == "yes"){
////            System.out.println("eligible");
////        }
////        else {
////            System.out.println("not eligible");
////        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your qualification (MSc completed or not completed): ");
        String qualification = sc.nextLine();
        System.out.println("Are you fluent in English? (yes or no): ");
        String englishFluency = sc.nextLine();

        if (qualification.equalsIgnoreCase("yes") && englishFluency.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible");
        } else if (qualification.equalsIgnoreCase("MSc not completed") && englishFluency.equalsIgnoreCase("no")) {
            System.out.println("You are not eligible");
        } else {
            System.out.println("Invalid input");
        }
    }
}
