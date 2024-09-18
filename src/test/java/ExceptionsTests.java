import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsTests {
    @Test
    void readLineFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt"));
        scanner.nextLine();
    }
    @Test
    void divisionByZeroCheck() {
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}
