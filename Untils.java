import java.util.Scanner;

public class Untils {
    static int ageValid(Scanner input){
       while (true) {
            System.out.println("Edad: ");
            int age = input.nextInt();
            
            if (age >= 18 && age <= 100) {
                return age;
            }else{
                System.out.println("Edad no valida");
            }
       }
       
    };
    

}
