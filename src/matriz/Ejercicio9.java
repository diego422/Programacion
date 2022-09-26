package matriz;

/**
 *
 * @author Diego Herrera López 
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        matrix1 = fill(matrix1);
        matrix2 = fill(matrix2);
        int[][] sumResult = new int[3][3];
        sumResult = sum(matrix1, matrix2);
        int[][] multiplicationResult = new int[3][3];
        multiplicationResult = multiplication(matrix1, matrix2);
        
        System.out.println("Suma:");
        for (int i = 0; i < sumResult.length; i++) {
            for (int j = 0; j < sumResult[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.print("  +  ");
            for (int j = 0; j < sumResult.length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");

            }
            System.out.print("  =  ");
            for (int j = 0; j < sumResult.length; j++) {
                System.out.print("[" + sumResult[i][j] + "]");

            }
            System.out.println("");
        }
        
        System.out.println("------------------------------------------------");
         System.out.println("Multiplicación:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            for (int j = 0; j < multiplicationResult[0].length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            System.out.print("  *  ");
            for (int j = 0; j < multiplicationResult.length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");

            }
            System.out.print("  =  ");
            for (int j = 0; j < multiplicationResult.length; j++) {
                System.out.print("[" + multiplicationResult[i][j] + "]");

            }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Transponer Suma:");
        sumResult = transposeSum(matrix1, matrix2, sumResult);
        for (int i = 0; i < sumResult.length; i++) {
            for (int j = 0; j < sumResult.length; j++) {
                System.out.print("[" + sumResult[i][j] + "]");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Transponer Multiplicación:");
        multiplicationResult = transposeMultiplication(matrix1, matrix2, multiplicationResult);
        for (int i = 0; i < multiplicationResult.length; i++) {
            for (int j = 0; j < multiplicationResult.length; j++) {
                System.out.print("[" + multiplicationResult[i][j] + "]");
            }
            System.out.println("");
        }
    }

    /**
     * Este metodo lo que hace es rellenar con numeros aleatorios en suma y
     * multiplicación
     */
    private static int[][] fill(int[][] matrix) {

        int[][] matrixRetorno = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int n = (int) (Math.random() * 100);
                matrixRetorno[i][j] = n;
            }
        }

        return matrixRetorno;

    }

    /**
     * En este metodo se hace la operación de la suma
     */
    private static int[][] sum(int[][] matrix1, int[][] matrix2) {

        int[][] sumMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }
        }

        return sumMatrix;
    }

    /**
     * En este metodo se hace la operación de la Multiplicación
     */
    private static int[][] multiplication(int[][] matrix1, int[][] matrix2) {
        int[][] multiplicationMatrix = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                multiplicationMatrix[i][j] = matrix1[i][j] * matrix2[i][j];

            }
        }
        return multiplicationMatrix;
    }

    /**
     * Este metodo sirve para transponer el resultado de la Suma
     */
    private static int[][] transposeSum(int[][] matrix1, int[][] matrix2, int sumResult[][]) {
        int[][] matrixTranspose = new int[matrix1.length][matrix2[0].length];
        for (int x = 0; x < matrix1.length; x++) {
            for (int y = 0; y < matrix2[0].length; y++) {

                matrixTranspose[y][x] = sumResult[x][y];
            }
        }
        return matrixTranspose;
    }
/**
 *  Este metodo sirve para transponer el resultado de la Multiplicación
 */
    private static int[][] transposeMultiplication(int matriz1[][], int[][] matrix2, int[][] multiplicationResult) {
        int[][] matrixtranspose2 = new int[matriz1.length][matrix2[0].length];
        for (int x = 0; x < matriz1.length; x++) {
            for (int y = 0; y < matrix2[0].length; y++) {

                matrixtranspose2[y][x] = multiplicationResult[x][y];
            }
        }
        return matrixtranspose2;
    }
}