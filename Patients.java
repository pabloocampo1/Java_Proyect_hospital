import java.util.ArrayList;

class Patients extends Person {
    private ArrayList<Citas> historialMedico;
    private String name;
    private int age;
    private int identification;
    private String rol;
    

    //constructor for patients
    public Patients(String name, int age, int identification){
        super(name, age, identification);
        this.historialMedico = new ArrayList<>();
        this.rol = "Paciente";
    }
    
    @Override
    public void showInfo(){
        System.out.println("Nombre: "+ this.name);
        System.out.println("Edad: "+ this.age);
        System.out.println("Identificacion: "+ this.identification);
    };
    @Override
    public String getRol(){
        return this.rol;
    };
    public void HisoryAppointments(){
        System.out.println("show clinical history");
    }
};