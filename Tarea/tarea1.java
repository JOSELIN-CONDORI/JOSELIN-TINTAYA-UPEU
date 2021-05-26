import java.util.Scanner;
public class tarea1 {
    static Scanner tecladoj=new Scanner(System.in);
     public static void salario() {
       //definir variables y otros
         int añosJMCT=1;
    double salario=1500;
       //proseso
      while (añosJMCT<=6) {
       salario=(salario*0.1)+salario;
       //datos de salida
       System.out.println("su salario del año es:"+añosJMCT+"es:"+salario);
       añosJMCT++;   
      }
    }


    public static void main(String[] args) {
        salario();
}
}

    

