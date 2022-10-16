package Examen1;
//Pregunta 12 del 1° Exámen de Programación 1
/**
 *
 * @author Diego
 */
public class Pregunta12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int value;
        value = 50;
        int sizeMatrix;
        sizeMatrix = 4;

        fillmatrix(sizeMatrix, value);

    }

    public static void fillmatrix(int sizeMatrix, int value) {
        int Matrix[][] = new int[sizeMatrix][sizeMatrix];
        int init = 3;
        
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = init; j < sizeMatrix; j++) {
                Matrix[i][j] = value;
                value = value + 10;
            }
            init = init - 1;
        }

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix.length; j++) {

                if (Matrix[i][j] < 50) {
                    System.out.print(String.valueOf(Matrix[i][j]).replaceAll("0", "    "));

                } else {
                    System.out.print(" " + Matrix[i][j] + "");
                }

            }
            System.out.println("");
        }

    }

}
