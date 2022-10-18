import java.util.Scanner;

public class mavenExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        if (Double.parseDouble(userInput) >= 0 || Double.parseDouble(userInput) <= 0){
            System.out.printf("%s is a number!%n",userInput);
        } else {
            System.out.printf("%s is not a number!%n",userInput);

//            System.out.printf(""); flip case and then reversed
        }
    }
}
