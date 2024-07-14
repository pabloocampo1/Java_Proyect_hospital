import java.util.InputMismatchException;
import java.util.Scanner;


public abstract class Person {
    int x = 2;
    private String name;
    private int age;
    private String userName;
    private String password;
    private String rol;
    private static int id = 10000;
    private Scanner input;
    

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        input = new Scanner(System.in);
        userName = this.name;
        password = Integer.toString(id);
        id++;
    }

    //getter para los datos principales
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    };

    public abstract String getRol();

    //setter para los datos
    public void setName(String name){
        this.name = name;
    };

    public void setAge(int age){
        this.age = age;
    };

    public abstract void showInfo();

    public String getUserName(){
        return this.userName;
    };
    public String getPassword(){
        return this.password;
    };
    //metodo para cambiar las credenciales del objecto doctor
    public void changeCredential(){
        boolean state = true;
        while (state) {
            try {
                System.out.println("1. Cambiar nombre de usuario -- 2.Cambiar contraseña -- 3.cambiar nombre de usuario y contraseña -- 4. salir");
                int opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese su nuevo nombre.");
                        String newUserName = input.next();
                        this.userName = newUserName;
                        break;

                    case 2:
                        System.out.println("Ingrese la nueva contraseña.");
                        String newPassword = input.next();
                        this.password = newPassword;
                        System.out.println("Se edito la contraseña correctamente.");
                        break;
                    case 3:
                        System.out.println("Ingrese su nuevo nombre.");
                        String newUserName1 = input.next();
                        this.userName = newUserName1;

                        System.out.println("Ingrese la nueva contraseña.");
                        String newPassword1 = input.next();
                        this.password = newPassword1;
                        System.out.println("Se edito la contraseña correctamente.");
                        break;
                    case 4:
                        state = false;
                        break;
                    default:
                        System.out.println("Opcion incorrecta, intentalo nuevamente");
                };
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                input.next();
            };
        }
    };
    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };
}
