import java.util.Scanner;

public class Untils {
    static int ageValid(Scanner input){
       while (true) {
            System.out.println("Edad: ");
            int age = input.nextInt();
            
            if (age >= 0 && age <= 150) {
                return age;
            }else{
                System.out.println("Edad no valida");
                ageValid(input);
            }
       }
       
    };

}
