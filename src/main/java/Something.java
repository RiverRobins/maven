import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Something {

    public static Scanner scs = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a thing");
            String input = scs.nextLine();
            if (!StringUtils.isNumeric(input)) {
                System.out.println("'" + input + "'" + " is NaN");
            } else {
                System.out.println("'" + input + "'" + " is a number");
            }
            System.out.println("Case inverted: " + StringUtils.swapCase(input));
            System.out.println("Reversed: " + StringUtils.reverse(input));
            System.out.println("\nContinue?(y or n)");
            input = scs.nextLine();
            if (input.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
