import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
    

        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();    
        if (number == 0) { 
            System.out.println( "ZERO" );
        } else if (number > 0) { 
            System.out.println ( "POSITIVE");
        } else if (number < 0 ) {
            System.out.println ("NEGATIVE");
        } 
    

        System.out.println("2. PRIME or COMPOSITE number");
            System.out.print("Enter the last digit of your student number: ");
            int lastDigit = scan.nextInt();
            boolean isPrime = true;
            for(int i = 2; i <= lastDigit/2; i++)
           {
                if(lastDigit % i == 0)
                 {isPrime = false;
            break;}
            }
            if (isPrime == true)
                System.out.println(lastDigit + " PRIME.");
            else
                System.out.println(lastDigit + " is not a Prime number\n(COMPOSITE)");

        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstname = scan.next();
        int stringSize = firstname.length();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int stringsize = surName.length();

        Object sum = stringSize + stringsize;
            System.out.println("The sum of the character length of your first name and your surname " + sum);
        
            int x;
            int y;
            int z;
            System.out.println("4. Largest Number");
            System.out.print("Enter first number: ");
                x =scan.nextInt();
            System.out.print("Enter second number: ");
                y=scan.nextInt();
            System.out.print("Enter third number: ");
                z =scan.nextInt();
            if (x>y && x>z){
            System.out.println("Largest number is:"+ x);
            }
            else if (y>z){
            System.out.println("Largest number is:"+ y);
            }
            else{
            System.out.println("Largest number is:"+ z);
            }

        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        if(firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == '0' || firstChar == 'U') {
            System.out.println("VOWELS");
        } else {
            System.out.println("CONSONANT");
        }

        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        if (studentNumber == 2022104934) { 
            System.out.println( "valid" );
        } else { 
            System.out.println ( "invalid");
        }

        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String SurName = scan.next();
        if (firstName == firstName.toUpperCase() && SurName == SurName.toLowerCase()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();
            switch (course){
                case "BSIT":
            System.out.print("Enter your specialization (MWA or MAA): ");
            String specialization1 = scan.next();
            switch (specialization1){
                case "MWA":
                System.out.print("you are taking BSIT-MWA ");
                break;
                case "MAA":
                System.out.println("You are taking BSIT-MAA ");
                break;
            }
                break;
                case "BSCS":
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();
                switch (specialization2){
                case "ML":
                System.out.println("You are taking BSCS-ML");
                break;
                case "DF":
                System.out.println("You are taking BSCS-DF");
                break;
             }
      }


        System.out.println("9. Selection");
        System.out.print("Enter your SHS strand: ");
        String strand = scan.next();

        switch (strand) {
            case "STEM":
                System.out.println("valid");
                break;
            case "ICT":
                System.out.println("valid");
                break;
            case "HUMSS":
                System.out.println("valid");
                break;
            case "HOME ECONIMICS":
                System.out.println("valid");
                break;
            case "ARTS AND DESIGN":
                System.out.println("valid");
                break;
            case "TVL MARITIME":
                System.out.println("valid");
                break;
            default:
                System.out.println("invalid");


        }

        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if (studentEmailAddress.contains("aganan") && studentEmailAddress.contains("@students.national-u.edu.ph")){
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        scan.close();
    }
}
