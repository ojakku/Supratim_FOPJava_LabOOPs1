import java.util.Scanner;
import java.util.Random;


class Employee {
    String firstName = "supratim"; 
    String lastName = "roy";
}

public class CredentialService {
    
    static String email = "";


    public static char[] generatePassword(int length) {

        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];
  
        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));
     
        for(int i = 4; i < length ; i++) {
           password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }

        return password;

    }

    public static String generateEmailAddress(String a, String b, String c, String d) {

        email = a + b + "@" + c + "." + d + ".com";
        return email;
       
    }

    public static void showCredentials(String firstName, String lastName) {
         int length = 8;
         char[] pass = generatePassword(length);
         String pass1 = String.valueOf(pass);


            System.out.println("Dear " + firstName + " " + lastName + " your generated credentials are as follows : ");
            System.out.println("Email    ----> " + email);
            System.out.println("Password ----> " + pass1);
    }

    public static void main(String[] args) {

        String departmentName = "";

        Scanner in = new Scanner(System.in);

        Employee employee = new Employee();

        String firstName = employee.firstName;
        String lastName = employee.lastName;
        String companyName = "abc";

        System.out.println("Please enter the department from the following : ");
        System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
        
        int department = in.nextInt();

        switch(department) {

            case 1:
            departmentName = "tech";
            generateEmailAddress(firstName, lastName, departmentName, companyName);
            CredentialService.showCredentials(firstName, lastName);
            break;

            case 2:
            departmentName = "admin";
            generateEmailAddress(firstName, lastName, departmentName, companyName);
            CredentialService.showCredentials(firstName, lastName);
            break;

            case 3:
            departmentName = "hr";
            generateEmailAddress(firstName, lastName, departmentName, companyName);
            CredentialService.showCredentials(firstName, lastName);
            break;

            case 4:
            departmentName = "legal";
            generateEmailAddress(firstName, lastName, departmentName, companyName);
            CredentialService.showCredentials(firstName, lastName);
            break;

            default:
            System.out.println("Invalid Choice, please try again.");
        }
        
        // generateEmailAddress(firstName, lastName, departmentName, companyName);
        // CredentialService.showCredentials(firstName, lastName);

    }



}
