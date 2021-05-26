import java.util.Scanner;

public class tarea4 {
     static Scanner teclado=new Scanner(System.in);
    public static void compañiafocos() {
        //definir Variables
        int nFocos, focoVerde=0, focoBlanco=0, focoRojo=0;
        //Datos de entrada
        System.out.println("Ingrese cantidad de Focos:");
        nFocos=teclado.nextInt();
        //Proceso
        for (int foco = 1; foco <= nFocos; foco++) {
        for (int nfocos = 1; foco<=nFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo)"+
            "del foco # "+foco+":");
            String color=teclado.next();
            if(color.toUpperCase().equals("fV")){ focoVerde++; }
            if(color.toUpperCase().equals("fB")){ focoBlanco=focoBlanco+1; }
            if(color.toUpperCase().equals("fR")){ focoRojo+=1; }
            System.out.println("");
        }
        //Datos de salida
        System.out.println("Del total de focos:\n"+focoVerde+" son Verde(s)\n"+
        focoBlanco+" son Blanco(s)\n"+focoRojo+" son Rojo(s)\nEn total son:"+nFocos);
    }
}
    public static void main(String[] args) {
        compañiafocos();
    }
}