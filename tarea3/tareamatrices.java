public class tareamatrices {
    
    public void imprimirMatrizCadenaJMCT(String[][] matrizjmct) {
        for (int f = 0; f < matrizjmct.length; f++) {
            for (int c = 0; c < matrizjmct[0].length; c++) {
                if(matrizjmct[f][c]!=null && !matrizjmct[f][c].equals("")){
                    System.out.print(matrizjmct[f][c]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        } 
    }  
    public void ejercicio06(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizjmct[i][j] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ EJEMPLO 6");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio07(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <(dimen1-i); j++) {
                 matrizjmct[i][j] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ  EJEMPLO 7");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio08(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <(dimen1-i); j++) {
                 matrizjmct[i][j+i] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ EJEMPLO 8");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio09(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizjmct[i][(dimen1-1)-i+j] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ EJEMPLO 9");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio10(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <=i; j++) {
                 matrizjmct[i][i-j] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ EJEMPLO 10");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio11(int dimen1, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen1][dimen1];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <(dimen1-i); j++) {
                 matrizjmct[i][(dimen1-1)-(j+i)] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        System.out.println("MATRIZ EJEMPLO 11");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    
    public void ejercicio12(int dimen, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen][dimen];// es i=filas, j=columnas
        for (int i = 0; i < matrizjmct.length; i++) {
             for (int j = 0; j <(dimen-i); j++) {
                 matrizjmct[i][(dimen-1)-j] = ""+numInitJMCT;
                 numInitJMCT++;
             }
        }
        
        System.out.println("MATRIz EJEMPLO 12");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void tejercicio13(int dimen, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen][dimen];// es i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < (matrizjmct.length)-j; i++) {            
                matrizjmct[i][j]=""+numInitJMCT;
                numInitJMCT++;
            }
        }
        System.out.println("MATRIZ EJEMPLO 13");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio14(int dimen, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen][dimen];// es i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i = 0; i < 1+j; i++) {            
                matrizjmct[i][j]=""+numInitJMCT;
                numInitJMCT++;
            }
        }
        System.out.println("MATRIZ EJEMPLO 14");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
    public void ejercicio16(int dimen, int numInitJMCT) {
        String[][] matrizjmct=new String[dimen][dimen];// es i=filas, j=columnas
        for (int j = 0; j <dimen; j++) {
            for (int i =4; i > (matrizjmct.length-2)-j; i--) {            
                matrizjmct[i][j]=""+numInitJMCT;
                numInitJMCT++;
            }
        }
        System.out.println("MATRIZ EJEMPLO 16");
        imprimirMatrizCadenaJMCT(matrizjmct);
    }
 


public static void main(String[] args) {
    tareamatrices transf=new tareamatrices();
    //transf.ejercicio06(5, 0);
    //transf.ejercicio07(5, 0);
    //transf.ejercicio08(5, 0);
    //transf.ejercicio09(5, 0);
    //transf.ejercicio10(5, 0);
    //transf.ejercicio11(5, 0);
    //transf.ejercicio12(5, 0);
    //transf.ejercicio13(5, 0);
    //transf.ejercicio14(5, 0);
     transf.ejercicio16(5, 0);

}
}