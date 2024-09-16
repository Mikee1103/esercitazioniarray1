package concessionario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int scelta;
        do {
            System.out.println("1-aggiungi auto");
            System.out.println("2-visualizza le auto");
            System.out.println("3-ricerca per marca e modello");
            System.out.println("4-cancella auto");
            System.out.println("5-modifica i dati di un'auto");
            System.out.println("6-visualizza le auto in ordine crescente");
            System.out.println("7-visualizza tutti i modelli diesel");
            System.out.println("8-esci");
            scelta=in.nextInt();
            switch (scelta) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:
                    break;

                default:
                    System.out.println("devi inserire un numero da 1 a 8");


            }

        }while (scelta!=8);
    }
}