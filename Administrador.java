
import java.util.Scanner;
class Administrador extends Person {
    
    private String rol;
    
    private Scanner input;
    
    

    // Constructor
    public Administrador(String name, int age, int identification){
        super(name, age, identification);
        this.rol = "Admin";
        this.input = new Scanner(System.in);
    
    };

    public void showInfo(){
        System.out.println(" - " + " - " + getName() + "- "+ getAge());
    }

    //metodo para unir los arrayList de los administradores que se pueden loguear
    @Override
    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };

    @Override
    public String getRol(){
        return this.rol;
    };

    //simulacion de login para tener diferentes funcionalidades.
    
    public void addDoctor(){
        System.out.println("Nombre: ");
        String name = input.nextLine();

        int age = Untils.ageValid(input);
        input.nextLine();

        Doctors doctor = new Doctors(name, age , 22382, "especial");
        managementHospital.Listadoctores.add(doctor);
        
    }

    public void AllDoctor(){
        for (Doctors doctor : managementHospital.Listadoctores) {
            doctor.showInfo();
        }
    }

};
