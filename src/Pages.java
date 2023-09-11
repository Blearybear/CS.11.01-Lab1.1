import java.util.Scanner;
public class Pages {

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
        int readPages = 100 - age;
        System.out.println("You are " + age + " years old, therefore you should read the first " + readPages + " pages of a book before giving up.");
    }
}
