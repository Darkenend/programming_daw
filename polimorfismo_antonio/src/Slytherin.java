public class Slytherin extends Alumno {
  private String arma;
    public Slytherin(String nombre, String apellidos, int edad, String arma){
        super(nombre,apellidos,edad);
        this.arma=arma;
    }

    public void setArma(String arma){
        this.arma=arma;
    }
    public String getArma(){
        return arma;
    }
    @Override
   public  String mostrarDeberes(){
       return "Torturé a un elfo doméstico para que los hiciera";
   }
    @Override
    public  String mostrarCasa(){
        return "Slytherin";
    }
    public void matarAlumno(Alumno alumno){
        System.out.println("He matado a : "+alumno);
    }
}
