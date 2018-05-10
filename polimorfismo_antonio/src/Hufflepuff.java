public class Hufflepuff extends Alumno {
  private String planta;
    public Hufflepuff(String nombre, String apellidos, int edad, String planta){
        super(nombre,apellidos,edad);
        this.planta=planta;
    }
    
    
    public void setPlanta(String planta){
        this.planta=planta;
    }
    public String getPlanta(){
        return planta;
    }
    @Override
   public  String mostrarDeberes(){
       return "¿Había deberes?";
   }
    @Override
    public  String mostrarCasa(){
        return "Hufflepuff";
    }
    
  @Override
    public String decirAsignatura(){
        return "Lenguaje de marcas y runas";
    }
}
