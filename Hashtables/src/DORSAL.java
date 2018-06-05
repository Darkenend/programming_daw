/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

class DORSAL{
    private String dorsal;
    public DORSAL(String dorsal) {
        this.dorsal=dorsal;
    }
    public int hashCode(){
        int valor=0;
        int nDigitos=dorsal.length();
        for(int i=0;i<3;i++){
            int temp;
            if(i<nDigitos)
                temp=(int)dorsal.charAt(i);
            else
                temp=0;
            valor=valor+temp*10;
        }
        return valor;
    }
    public boolean equals(Object Obj){
        DORSAL aux=(DORSAL)Obj;
        return dorsal.equals(aux.dorsal);
    }
}
