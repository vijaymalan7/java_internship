import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-=_+[]{}|;:,.<>/?";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();
        
        System.out.println("Select the complexity level:");
        System.out.println("1. Lowercase letters");
        System.out.println("2. Uppercase letters");
        System.out.println("3. Numbers");
        System.out.println("4. Special characters");
        System.out.println("5. Combination of the above");
        System.out.print("Enter your choice: ");
        int complexity = scanner.nextInt();
        
        String characters = "";
        switch (complexity) {
            case 1:
                characters = LOWERCASE_LETTERS;
                break;
            case 2:
                characters = UPPERCASE_LETTERS;
                break;
            case 3:
                characters = NUMBERS;
                break;
            case 4:
                characters = SPECIAL_CHARACTERS;
                break;
            case 5:
                characters = LOWERCASE_LETTERS + UPPERCASE_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
                break;
            default:
                System.out.println("Invalid choice. Generating password with a combination of all complexity levels.");
                characters = LOWERCASE_LETTERS + UPPERCASE_LETTERS + NUMBERS + SPECIAL_CHARACTERS;
                break;
        }
        
        String password = generatePassword(length, characters);
        System.out.println("Generated Password: " + password);
        
        scanner.close();
    }
    
    public static String generatePassword(int length, String characters) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }
        
        return password.toString();
    }
}
