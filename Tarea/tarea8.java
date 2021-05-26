import java.util.Scanner;
class tarea8{
static Scanner teclado=new Scanner(System.in);
static void productosJMCT(){
//Definir variables y otros
System.out.println("definir cuanto se le descontara");
String descuentoJMCT=""; 
//datos de entrada
int precio= teclado.nextInt();
if(precio<=200){
descuentoJMCT="0.15";
}else if (precio>100 && precio<200){
descuentoJMCT="0.12";}
else if (precio<100){
descuentoJMCT="0.10";}
 //Datos de salida:
System.out.println("usted recibir un descuento de: "+descuentoJMCT);
}
public static void main(String[] arg){
    productosJMCT();
}
}