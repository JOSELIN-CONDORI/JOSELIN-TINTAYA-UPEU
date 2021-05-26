import java.util.Scanner;
public class tarea5 {
    static Scanner teclado=new Scanner(System.in);
    public static void ahorropesos() {
        //definir variables y otros
        int ahorroJMCT=1;
        int variableJMCT=1;
         //proseso 
        while (ahorroJMCT<=365) {
            variableJMCT*=3;
        ahorroJMCT++; 
        }
        //datos de salida
System.out.println("los dias que ahorro usted es de: "+(ahorroJMCT-1)+":");
System.out.println("su ahorro en un año es:"+variableJMCT );

    }
public static void main(String[] args) {
    ahorropesos();
}
}
