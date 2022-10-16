//Pregunta 12 del 1° Exámen de Programación 1
package Examen1;

/**
 *
 * @author Diego Herrera López
 * @author James Arias Avalos
 */
public class Pregunta12 {

    /**
     * Declaración de variables y llamado del metodo fillmatrix(sizeMatrix,
     * value)
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables 
        int value;
        value = (int) (Math.random() * 100);
        int sizeMatrix;
        sizeMatrix = 4;

        //Llamado del metodo 
        fillmatrix(sizeMatrix, value);

    }

    /**
     * Este metodo lo que hace es llenar una matriz con restricciones en sus
     * filas y números de 4 en 4 apartir de un valor aleatorio y despues se va a
     * imprirmir de manera escalonada
     *
     * @param sizeMatrix
     * @param value
     */
    public static void fillmatrix(int sizeMatrix, int value) {
        int Matrix[][] = new int[sizeMatrix][sizeMatrix];
        int init = sizeMatrix-1;

        //Llena la matriz aumentando en 10 y le disminuye 1
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = init; j < sizeMatrix; j++) {
                Matrix[i][j] = value;
                value = value + 10;
            }
            init = init - 1;
        }

        //Imprimir la matriz
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {

                if (Matrix[i][j] == 0) {
                    System.out.print(String.valueOf(Matrix[i][j])
                            .replaceAll("0", "    "));

                } else {
                    System.out.print(" " + Matrix[i][j] + "");
                }

            }
            System.out.println("");
        }

    }

}