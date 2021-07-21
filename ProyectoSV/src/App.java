import pe.edu.upeu.SubProgramas;
import pe.edu.upeu.recur.EjemplosRecursivos;
import pe.edu.upeu.util.TecladoRead;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        SubProgramas objSP=new SubProgramas();
        EjemplosRecursivos objER=new EjemplosRecursivos();
        TecladoRead tr=new TecladoRead();
        //objSP.calcularFuncionExponecial();
        int numero=tr.read(0, "Indroducir un numero:");
        /*Sy stem.out.println("Factorial iterativo: "+objER.factorialBig(numero)); 
        System.ou }t.println("Factorial Recursivo: "+objER.factorialBigRecur(numero)); */
        long ti  =System.currentTimeMillis();
        System.out.println("Fibonaci iterativo: "+objER.fibonaci(numero)); 
        long tf=System.currentTimeMillis();
        System.out.println("Fibonaci recursivo: "+ (tf-ti)); 

        long ti=System.currentTimeMillis();
        System.out.println("Fibonaci iterativo: "+objER.fibonaci(numero)); 
        long tf=System.currentTimeMillis();
        System.out.println("Fibonaci recursivo: "+ (tf-ti)); 

    }    
    }

