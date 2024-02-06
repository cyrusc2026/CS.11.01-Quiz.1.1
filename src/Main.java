import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
System.out.println("What is your age?");
        age = scanner.nextInt();
        System.out.println("What is your first name?");
        firstName = scanner.next();
        System.out.println(firstName);
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        favouriteFood = scanner.nextLine();
System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);





    }

}