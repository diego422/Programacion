package matriz;

/**
 *
 * @author diego
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        matriz1 = llenar(matriz1);
        matriz2 = llenar(matriz2);
        int[][] sumResult=new int [3][3];
        sumResult= suma(matriz1,matriz2);
        int resultadomulti[][]=new int [3][3];
        resultadomulti= multiplicacion(matriz1,matriz2);
        
        
        for (int i = 0; i < sumResult.length; i++) {
            for (int j = 0; j < sumResult[0].length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.print("  +  ");
            for (int j = 0; j < sumResult.length; j++) {
                System.out.print("["+matriz2[i][j]+"]");
                
            }
             System.out.print("  =  ");
             for (int j = 0; j < sumResult.length; j++) {
                System.out.print("["+sumResult[i][j]+"]"); 
                
            }
             System.out.println("");
        }
        System.out.println("------------------------------------------------");
        for (int i = 0; i < resultadomulti.length; i++) {
            for (int j = 0; j < resultadomulti[0].length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.print("  *  ");
            for (int j = 0; j < resultadomulti.length; j++) {
                System.out.print("["+matriz2[i][j]+"]");
                
            }
             System.out.print("  =  ");
             for (int j = 0; j < resultadomulti.length; j++) {
                System.out.print("["+resultadomulti[i][j]+"]"); 
                
            }
             System.out.println("");
        }
        sumResult= trasponer(matriz1,matriz2,sumResult);
        for (int i = 0; i < sumResult.length; i++) {
            for (int j = 0; j < sumResult.length; j++) {
                System.out.print(" "+sumResult[i][j]);
            }
            System.out.println("");
        }

    }

    private static int[][] llenar(int[][] matriz) {

        int matrizRetorno[][] = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int n = (int) (Math.random() * 100);
                matrizRetorno[i][j] = n;
            }
        }

        return matrizRetorno;

    }

    private static int[][] suma(int matriz1[][], int matriz2[][]) {

        int matrizsuma[][] = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizsuma[i][j] = matriz1[i][j] + matriz2[i][j];

            }
        }

        return matrizsuma;
    }
    private static int [][] multiplicacion(int matriz1[][], int matriz2[][]){
        int matrizmulti [][] = new int[3][3];
        
         for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matrizmulti[i][j] = matriz1[i][j] + matriz2[i][j];
        
    }
}
 return matrizmulti;
    }
    private static int [][] trasponer(int matriz1[][], int matriz2[][], int resultadosuma[][]){
         int matrizT[][] = new int[matriz1.length][matriz2[0].length];
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matriz2[0].length; y++) {

                matrizT[y][x] = resultadosuma[x][y];
            }
        }
        return matrizT;
}
}