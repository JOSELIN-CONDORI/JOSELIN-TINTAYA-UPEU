import java.util.Scanner;
public class tarea9 {
    static Scanner teclado=new Scanner(System.in);
    public static void depositoJMCT () {
        double cantidad=0;
        int cantaños=0, contador=1;
        System.out.println("ingrese la cantidad de dinero:");
            cantaños=teclado.nextInt();
        while (contador<=cantaños) {
            System.out.println(""+contador+"cuanto ingreso en todos estos años:");
            cantidad=teclado.nextInt();
            cantidad=(cantidad*0.1)+cantidad;
            System.out.println("el año "+cantaños+"ahorro :"+cantidad);
            contador++;
        }
        
    }
    public static void main(String[] args) {
        depositoJMCT();
    }
    
}