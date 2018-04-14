package xd;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class RevolucionFrancesa {

    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        RevolucionFrancesa op = new RevolucionFrancesa();
        op.start();
    }

    public void start() {
        double x= 22.0;
        for(int i=1; i<=10000;i++){
            x=Math.sqrt(x)*i;
        }
        System.out.println(x);
    }
}
