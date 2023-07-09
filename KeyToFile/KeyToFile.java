import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KeyToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the text to be saved: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(input);
            System.out.println("Input saved to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the input to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}