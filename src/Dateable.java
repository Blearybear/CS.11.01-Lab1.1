import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(myScanner.nextLine());
            }
            catch (NumberFormatException e){
                System.out.println("Please enter a valid number.");
            }
        }
        int datingAge = (age/2) + 7;
        System.out.println("You are " + age + " years old, therefore you should be dating someone who is at least " + datingAge + ".");
    }

}
