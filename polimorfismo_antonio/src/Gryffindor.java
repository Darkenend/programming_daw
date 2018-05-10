public class Gryffindor extends Alumno {
    
    private String mascota;
    public Gryffindor(String nombre, String apellidos, int edad, String mascota){
        super(nombre,apellidos,edad);
        this.mascota=mascota;
    }
    
    
    public void setMascota(String mascota){
        this.mascota=mascota;
    }
    public String getMascota(){
        return mascota;
    }
    @Override
   public  String mostrarDeberes(){
      return "Por supuesto los he hecho";
   }
    @Override
    public  String mostrarCasa(){
        return "Gryffindor";
    } 
    
    
}
