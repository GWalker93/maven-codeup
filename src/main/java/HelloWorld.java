import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Something:");
        String input = sc.nextLine();

        System.out.println("You entered:" + input);

        if (!StringUtils.isNumeric(input) )
            {
                System.out.println(input + " is not a number.");
            }

        else
            {
                System.out.println(input + " is a number.");
            };

        System.out.println("Flipped case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));

    };
}
