package matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Este  el labaratorio sobre la clase String, donde se hacen procedimientos como
 * identificar quien escribio la letra del himno nacional, la musica del himno 
 * nacional, dividir por estrofas el himno, buscar una palabra y ver si existe 
 * o no y poner el himno como si se estuviera cantando karaoke.
 * @author Dilan Chavarro Valdez
 * @author Diego Herrera Lopez
 * @author Yordany Navarro Hernandez
 * @author Jose Pablo Solis Rodriguez
 */
public class HimnoNacional {

    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /**
     *Busca una palabra solicitada y determina si existe o no existe
     * @param aBuscar
     * @return
     * @throws IOException
     */
    public static boolean existeString(String aBuscar) throws IOException {
        boolean found = false;
        String words[] = song.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll(",", "").replaceAll(";", "")
                    .replaceAll("!", "").replaceAll("¡", "").replaceAll("#", "")
                    .replaceAll("-", "").replaceAll(" ", "")
                    .replaceAll("í", "i").replaceAll("ó", "o")
                    .replaceAll("ú", "u").replaceAll("á", "a")
                    .replaceAll("é", "e");
        }
        System.out.println("Palabra a buscar");
        String search = br.readLine();
        for (int i = 0; i < words.length; i++) {

            if (search.equals(words[i])) {
                found = true;
                break;
            }
        }
        return found;
    }

    /**llama el metodo menu
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        menu();

    }
    static String song = "Noble patria, tu hermosa bandera "
            + "- expresión de tu vida nos da; "
            + "- bajo el límpido azul de tu cielo "
            + "- blanca y pura descansa la paz#\n"
            + "\n"
            + "\n"
            + " En la lucha tenaz, de fecunda labor "
            + "- que enrojece del hombre la faz, "
            + "- conquistaron tus hijos\n"
            + " labriegos sencillos - eterno prestigio, estima y honor.\n"
            + "\n"
            + " ¡Salve, oh tierra gentil! - ¡Salve, oh madre de amor! "
            + "- Cuando alguno pretenda - tu gloria manchar, "
            + "- verás a tu pueblo valiente y viril, "
            + "- la tosca herramienta en arma trocar#\n"
            + "\n"
            + " Salve oh Patria tú pródigo suelo, "
            + "- dulce abrigo y sustento nos da; "
            + "- bajo el límpido azul de tu cielo "
            + "- ¡vivan siempre el trabajo y la paz!";

    static String data = "Letra: José María Zeledón , "
            + "Música: Manuel María Gutiérrez";

    /**
     *Muestra una serie de opciones al usuario
     * @throws InterruptedException
     */
    public static void menu() throws InterruptedException {
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "     " + ANSI_RED_BACKGROUND + "      " + ANSI_GREEN_BACKGROUND + "      " + ANSI_RED_BACKGROUND + "      " + ANSI_GREEN_BACKGROUND + "      ");
        System.out.println(ANSI_GREEN_BACKGROUND + "     " + ANSI_RED_BACKGROUND + "      " + ANSI_GREEN_BACKGROUND + "      " + ANSI_RED_BACKGROUND + "      " + ANSI_GREEN_BACKGROUND + "      ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println(ANSI_GREEN_BACKGROUND + "     " + ANSI_RED_BACKGROUND + "                  " + ANSI_GREEN_BACKGROUND + "      ");
        System.out.println(ANSI_GREEN_BACKGROUND + "                             ");
        System.out.println("");
        System.out.println(ANSI_BLUE_BACKGROUND + "                             ");
        System.out.println(ANSI_WHITE_BACKGROUND + "                             ");
        System.out.println(ANSI_RED_BACKGROUND + "                             ");
        System.out.println(ANSI_WHITE_BACKGROUND + "                             ");
        System.out.println(ANSI_BLUE_BACKGROUND + "                             ");

        System.out.println("Bienvenido al Sistema");
        System.out.println("Opción 1: ver quien es el creador de la letra del "
                + "himno nacional \nopción 2: ver quien es el creador de la "
                + "musica del himno nacional \nopción 3: ordenar la canción y "
                + "verla en orden, no en parrafo \nopción 4: buscar una palabra"
                + "\nopción 5: modo karaoke \nopción 6: salir");

        try {

            int opc = Integer.parseInt(br.readLine());

            switch (opc) {
                case 1:
                    System.out.println("" + data.substring(7, 25));
                    menu();
                    break;
                case 2:
                    System.out.println("" + data.substring(36, 58));
                    menu();
                    break;
                case 3:

                    String verse[] = song.split("-");

                    for (int i = 0; i < verse.length; i++) {
                        System.out.println(verse[i]);
                    }
                    menu();
                    break;
                case 4:
                    if (existeString("")) {
                        System.out.println("Si existe");
                    } else {
                        System.out.println("No existe");
                    }
                    menu();
                    break;
                case 5:
                    String stanza[] = song.split("#");
                    for (int i = 0; i < stanza.length; i++) {
                        if (i == 2) {

                        }
                        String lines[] = stanza[i].split("-");
                        for (int j = 0; j < lines.length; j++) {
                            String term[] = lines[j].split(" ");
                            for (int k = 0; k < term.length; k++) {

                                System.out.print(" " + ANSI_WHITE
                                        + ANSI_BLUE_BACKGROUND + term[k]);
                                Thread.sleep(400);

                            }
                            System.out.println("");
                        }

                    }
                    menu();
                    break;
                case 6:
                    break;

                default: {
                    menu();
                }
            }

        } catch (IOException iOException) {
        } catch (NumberFormatException numberFormatException) {
        }

    }
}
