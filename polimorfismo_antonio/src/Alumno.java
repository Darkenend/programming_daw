public abstract class Alumno {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    
    public Alumno (String nombre, String apellidos,int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    
    //geters y seters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    
    
    
    public abstract String mostrarDeberes();
    public abstract String mostrarCasa();
    
    public String decirAsignatura(){
        return "Entornos de desarrollo mágico";
    }
    
    
}
