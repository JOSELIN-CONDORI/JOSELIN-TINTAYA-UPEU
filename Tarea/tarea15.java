import java.util.Scanner;
class ejercicio15{
static Scanner teclado=new Scanner(System.in);
static void sueldosemanal(){
//Definir variables y otros
System.out.println("determinar su sueldo semanal:");
String descuenta="";
//datos de entrada
int ganancias= teclado.nextInt();
if(ganancias<=150){
descuenta="0.5";
}
else if (ganancias>150 && ganancias<300){
 descuenta="0.7";}
 else if (ganancias>300 && ganancias<450){
 descuenta="0.9";}
  //Datos de salida:
  System.out.println("se le descuentara : "+descuenta);
}
public static void main(String[] arg){
  sueldosemanal();
}
}