
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
    public String getRol(){
        return this.rol;
    };

    //simulacion de login para tener diferentes funcionalidades.
    
    public void addDoctor(){
        System.out.println("Nombre: ");
        String name = input.nextLine();

        int age = Untils.ageValid(input);
        
        int identification = 0;
        boolean isIdentification = false;
        while (!isIdentification) {
            System.out.println("Identificacion: ");
            int identification_p = input.nextInt();

            if (managementHospital.Listadoctores.size() <= 0) {
                identification = identification_p;
                break;
            }

            boolean isValid = false;
            for (Doctors doct : managementHospital.Listadoctores) {
                if (doct.getIdentification() != identification_p) {
                    isValid = true;
                    isIdentification=true;
                }
            }

            if(!isValid){
                System.out.println("el numero de identifacion ya existe, intentalo nuevamente");
            }
        }

        input.nextLine();
        System.out.println("Especialidad: ");
        String Specially = input.nextLine();

        Doctors doctor = new Doctors(name, age , identification, Specially);
        managementHospital.Listadoctores.add(doctor);
    }

    
    public void editDoctor(){
        System.out.println("Escriba la identificacion del doctor: ");
        int n_identification = input.nextInt();
        
        boolean isDoctor = false;

        for (Doctors doctor : managementHospital.Listadoctores) {
            if (doctor.getIdentification() == n_identification){
                Boolean menuActive = true;
                while (menuActive) {
                    System.out.println("1. Editar nombre");
                    System.out.println("2. Editar edad");
                    
                    System.out.println("que deceas editar?");
                    int option = input.nextInt();
                    input.nextLine();
                    switch (option) {
                        case 1:
                            System.out.println("nuevo nombre: ");
                            String newName = input.nextLine();
                            doctor.setName(newName);
                            menuActive = false;
                            break;
                        case 2:
                            System.out.println("nueva edad: ");
                            int newAge = Untils.ageValid(input);
                            doctor.setAge(newAge);
                            menuActive = false;
                            break;
                        default:
                        System.out.println("opcion no valida");
                            break;
                    }
                    
                }

                isDoctor = true;
            }
        }

        if (!isDoctor){
            while (true) {
                System.out.println("no se encontro el doctor, decea intentarlo nuevamente? (si/no)");
                String response = input.nextLine().trim().toLowerCase();

                if (response.equals("si")) {
                    editDoctor();
                    
                }else if(response.equals("no")){
                    System.out.println("okey");
                    break;
                }else{
                    System.out.println("opcion no validad");
                }
            }
        }else{
            System.out.println("se edito correctamente");
        }
    }


    public void AllDoctor(){
        if (managementHospital.Listadoctores.size() < 1){
            System.out.println("no hay doctores agregados.");
        }
        for (Doctors doctor : managementHospital.Listadoctores) {
            doctor.showInfo();
        }
    }
    @Override
    public void closeScanner() {
        if (input != null) {
            input.close();
        };
    };

};
