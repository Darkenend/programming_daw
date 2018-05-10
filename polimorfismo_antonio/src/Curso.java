public class Curso {
    static final int EDAD_MINIMA=11;
    static final int CURSOS=7;
    private int gryffindor;
    private int slytherin;
    private int hufflepuff;
    private int ravenclaw;
    private Alumno[] alumnos;
    private int contador=0;
    
    public Curso(int gryffindor, int slytherin, int hufflepuff, int ravenclaw){
        this.gryffindor=gryffindor;
        this.slytherin=slytherin;
        this.hufflepuff=hufflepuff;
        this.ravenclaw=ravenclaw;
        
        
    }
    
    private int obtenerNumero(int num){
       return (int)Math.floor(Math.random()*num);
    }
    private String obtenerNombre(){
        String [] nombre={"Cristina","Marta","Elena","Mercedes","Raquel",
            "Natalia","Eva","Carla","Fernando","Édgar","Pablo","Carlos","David",
            "Antonio","Adrian","Álvaro","Daniel","Gabriel"};
        return nombre[obtenerNumero(nombre.length)];
    }
    private String obtenerApellidos(){
        String apellidos;
        String [] apellido={"García","López","Ramirez","Cardona", "Lázaro",
            "Marín","Montesinos","Martínez", "Carrascosa", "Aparisi", "Forés",
            "Sanz", "Martín", "Bernalte", "Bort", "Escudero"};
        
        
        apellidos=apellido[obtenerNumero(apellido.length)]+" "+
                apellido[obtenerNumero(apellido.length)];
        return apellidos;
    }
    private int obtenerEdad(){
        return obtenerNumero(CURSOS)+EDAD_MINIMA;
    }
    private String obtenerMascota(){
        String [] mascota={"rata","rana","buho","lagarto","murcielago"};
        return mascota[obtenerNumero(mascota.length)];
    }
    private String obtenerArma(){
        String [] arma={"varita","horrocrux","Nagini","pistola (mágica)","poción"};
        return arma[obtenerNumero(arma.length)];
    }
    private String obtenerPlanta(){
        String [] planta={"lazo del diablo","branquialgas","Belladona","Acónito"};
        return planta[obtenerNumero(planta.length)];
    }
    private String obtenerLibro(){
        String [] libro={"Librarse de hombres lobo", "Historia de la magia", "Sobrevivir a ED", " Aprobar ED. Más que magia, milagro"};
        return libro[obtenerNumero(libro.length)];
    }
    public void crearAlumnos(){
        alumnos=new Alumno[gryffindor+slytherin+hufflepuff+ravenclaw];
        crearGryffindor();
        crearSlytherin();
        crearHufflepuff();
        crearRavenclaw();
    }
    public void listarAlumnos(){
        for(int i=0;i<alumnos.length;i++){
            System.out.println("Alumno: "+alumnos[i].getNombre()+" "+alumnos[i].getApellidos()+" Casa: "+alumnos[i].mostrarCasa()+"\n Su"
                    + " asignatura favorita es: "+alumnos[i].decirAsignatura()+ " y sobre los deberes"
                            + " tiene que decir: "+alumnos[i].mostrarDeberes());
        }
    }
    private void crearGryffindor(){
        for (int i=0;i<gryffindor;i++){
            alumnos[contador]=new Gryffindor(obtenerNombre(),obtenerApellidos(),obtenerEdad(),obtenerMascota());
            contador++;
        }
    }
    private void crearSlytherin(){
        for (int i=0;i<slytherin;i++){
            alumnos[contador]=new Slytherin(obtenerNombre(),obtenerApellidos(),obtenerEdad(),obtenerArma());
            contador++;
        }
    }
    private void crearHufflepuff(){
        for (int i=0;i<hufflepuff;i++){
            alumnos[contador]=new Hufflepuff(obtenerNombre(),obtenerApellidos(),obtenerEdad(),obtenerPlanta());
            contador++;
        }
     }
    private void crearRavenclaw(){
        for (int i=0;i<ravenclaw;i++){
            alumnos[contador]=new Ravenclaw(obtenerNombre(),obtenerApellidos(),obtenerEdad(),obtenerLibro());
            contador++;
        }
     }
    
}
