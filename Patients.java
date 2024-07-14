import java.util.ArrayList;

class Patients extends Person {
    private ArrayList<Citas> historialMedico;
    private String name;
    private int age;
    private int identification;
    private static int id = 100000;

    //constructor for patients
    public Patients(String name, int age, int identification){
        super(name, age);
        this.identification =identification;
        this.historialMedico = new ArrayList<>();
        id++;
    }
    
    @Override
    public void showInfo(){
        System.out.println("Nombre: "+ this.name);
        System.out.println("Edad: "+ this.age);
        System.out.println("Identificacion: "+ this.identification);
    };

    public int getId(){
        return id;
    };
   
    

    public void setIdentification(int identification){
        this.identification = identification;
    };

    public void HisoryAppointments(){
        System.out.println("show clinical history");
    }
};