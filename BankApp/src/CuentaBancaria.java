
public final class CuentaBancaria {
    private String titular;
    private double saldo;
    private String entidad;
    private String oficina;
    private String numCuenta;
    public static final int MAXLENGTH=100;
    public static final int MINLENGTH=10;

    public CuentaBancaria(String titular, String entidad, String oficina, String DC,String numCuenta) throws Exception{
        if(titular.length()<MINLENGTH || titular.length()>MAXLENGTH)
            throw new IllegalArgumentException("Sólo se admiten nombres de titular entre 10 y 100 caracteres");
        if(!entidad.equals(String.valueOf(Integer.parseInt(entidad))))
            throw new IllegalArgumentException("Número de entidad no válido");
        if(!oficina.equals(String.valueOf(Integer.parseInt(oficina))))
            throw new IllegalArgumentException("Número de oficina no válido");
        if(!numCuenta.equals(String.valueOf(Integer.parseInt(numCuenta))))
            throw new IllegalArgumentException("Número de cuenta no válido");
        if(!comprobarCCC(entidad+oficina+DC+numCuenta))
            throw new IllegalArgumentException("Codigo Cuenta Cliente no válido");
        if(!DC.equals(obtenerDigitosControl(entidad,oficina,numCuenta)))
            throw new IllegalArgumentException("Dígitos de Control NO válidos");
        this.titular=titular;
        this.entidad=entidad;
        this.oficina=oficina;
        this.numCuenta=numCuenta;
        this.saldo=0;
    }

    public CuentaBancaria(String titular, String CCC) throws Exception{
        this (titular, CCC.substring(0, 4), CCC.substring(4, 8), CCC.substring(8, 10), CCC.substring(10, 20));
        if (!comprobarCCC(CCC))
            throw new IllegalArgumentException("Número de cuenta no válido");
    }

    public void setTitular(String titular) throws Exception{
        if(titular.length()>=MINLENGTH && titular.length()<=MAXLENGTH){
            this.titular=titular;
        }else{
            throw new IllegalArgumentException("Sólo se admiten nombres de titular entre 10 y 100 caracteres");
        }
    }

    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getEntidad(){
        return entidad;
    }

    public String getOficina(){
        return oficina;
    }

    public String getNumCuenta(){
        return numCuenta;
    }

    public void ingresar(double cantidad) throws Exception{
        if(cantidad>=0){
            saldo+=cantidad;
        }else{
            throw new IllegalArgumentException("Sólo se permiten valores positivos");
        }
    }

    public void retirar(double cantidad) throws Exception{
        if(cantidad>=0){
            if(cantidad<=getSaldo()){
                saldo-=cantidad;
            }else{
                throw new IllegalArgumentException("El saldo es inferior a la cantidad a descontar");
            }
        }else{
            throw new IllegalArgumentException("Sólo se permiten valores positivos");
        }
    }

    public static boolean comprobarCCC(String CCC){
        boolean si=false;
        int valor;
        CCC=CCC.trim();
        if(CCC.length()==20){
            si=true;
            for(int i=0;i<CCC.length();i++){
                valor=CCC.charAt(i)-48;
                if(valor<0 || valor>10)
                    si=false;
            }
        }
        if(si){
            return true;
        }else{
            return false;
        }
    }

    public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta){
        int [] numeSerie={1,2,4,8,5,10,9,7,3,6};
        String entOfi="00"+entidad+oficina;
        String nume=numCuenta;
        String DC="";
        int dc1=0;
        int dc2=0;
        for(int x=0;x<numeSerie.length;x++){
            dc1+=numeSerie[x]*(entOfi.charAt(x)-48);
            dc2+=numeSerie[x]*(nume.charAt(x)-48);
        }
        dc1=11-(dc1%11);
        dc2=11-(dc2%11);
        dc1=dc1==11?0:dc1==10?1:dc1;
        dc2=dc2==11?0:dc2==10?1:dc2;
        DC=String.valueOf(dc1)+String.valueOf(dc2);
        return DC;
    }

    public String toString(){
        return titular+" CC:"+numCuenta+" Saldo:"+saldo;
    }
}
