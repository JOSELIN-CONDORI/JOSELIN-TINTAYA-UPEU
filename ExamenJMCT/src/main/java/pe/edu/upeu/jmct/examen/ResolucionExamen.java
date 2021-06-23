package pe.edu.upeu.jmct.examen;

import java.util.Scanner;

import pe.edu.upeu.jmct.utils.LeerTeclado;

public class ResolucionExamen {
    Scanner teclado =new Scanner(System.in);
    LeerTeclado tecladoJ=new LeerTeclado();

    public void CompañiaAutomotriz() { 
    int categoria, cantidad=0,impuesto1=12,impuesto2=8,impuesto3=5;
        do {
            categoria=tecladoJ.leer(0,"¿Que categoria es su auto: 1-2-3?");
           
        switch (categoria) {
            case 1:
            cantidad=tecladoJ.leer(0,"cuantos vehiculos tiene de categoria 1");

                for (int j = 0; j < cantidad; j++) {
                System.out.println("Usted tiene que pagar: "+impuesto1+"%");
                }
                System.out.println("De toda la categoria se pagara"+impuesto1+"%");
                break;
            case 2:
            cantidad=tecladoJ.leer(0,"cuantos vehiculos tiene de categoria la 2");
             
                for (int j = 0; j < cantidad; j++) {
                System.out.println("Usted tiene que pagar: "+impuesto2+"%");
               }
               System.out.println("De toda la categoria se pagara"+impuesto2+"%");
                break;
            case 3:
            cantidad=tecladoJ.leer(0,"cuantos vehiculos tiene de categoria 3");

                for (int j = 0; j < cantidad; j++) {
                System.out.println("Usted tiene que debe pagar: "+impuesto3+"%");
                }
                System.out.println("De toda la categoria se pagara"+impuesto3+"%");
                break;
            default:System.out.println("Opcion incorrecta--escoja entre 1-2-3");
                break;
        }
        }
    
    while (categoria!=0);
 }
 public void tablamultiplicar() {
    int numero=1;

    for (int i = 0; i <20; i++) {
    for (int j = 1; j <=10; j++) {
        System.out.println(numero+"x"+j+"="+(j*numero));
       
    }
    numero=numero+1;
    System.out.println("siguiente");
    }
}


	public void resolverproblema4() {
            
        System.out.println("ingrese un numero :");
  
        if(isPerfect(teclado.nextInt()))
      
        System.out.println("El numero es perfecto :");
      
        else
       
        System.out.println("El numero no es perfecto :");
      
      
      }
      public static boolean isPerfect(int number) {
        boolean boo1 =false;
        int addDivisors = 0, divisor=1;
        while(divisor  <= number/2 ) {
     
        if ( number % divisor == 0)
           addDivisors += divisor;
           divisor++;
     
        }
     
        if (addDivisors == number)
        boo1= true;
     
        return boo1;
     
       }


    public int potenciajmct(int b, int e) {
        if (e==1) {
            return b;
        } if (e==0) {
            return 1;
        } else{
            return b * potenciajmct(b, e-1);
        }
}   

}   

