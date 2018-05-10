public class Ravenclaw extends Alumno {
  private String libro;
    public Ravenclaw(String nombre, String apellidos, int edad, String libro){
        super(nombre,apellidos,edad);
        this.libro=libro;
    }
    
    
    public void setLibro(String libro){
        this.libro=libro;
    }
    public String getLibro(){
        return libro;
    }
    @Override
   public  String mostrarDeberes(){
       return "¿A eso llamas deberes?";
   }
    @Override
    public  String mostrarCasa(){
        return "Slytherin";
    }
    
}
