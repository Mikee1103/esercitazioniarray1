package concessionario;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int indice;
        int scelta;
        String AggiungiMarca, AggiungiModello;
        double AggiungiPrezzo;
        String[] modello= new String[100];
        String[] marca= new String[100];
        double[] prezzo= new double[100];
        int conta =0;
        do {
            System.out.println("1-aggiungi auto");
            System.out.println("2-visualizza le auto");
            System.out.println("3-ricerca per marca e modello");
            System.out.println("4-cancella auto");
            System.out.println("5-modifica i dati di un'auto");
            System.out.println("6-visualizza le auto in ordine crescente");
            System.out.println("7-visualizza tutti i modelli diesel");
            System.out.println("8-esci");
            scelta=Integer.parseInt(in.next());
            switch (scelta) {
                case 1:
                    System.out.println("dammi una marca");
                    AggiungiMarca = in.next();
                    System.out.println("dammi un modello");
                    AggiungiModello = in.next();
                    System.out.println("dammi un prezzo");
                    AggiungiPrezzo = Double.parseDouble(in.next());
                    funzioni.aggiunta(AggiungiMarca, AggiungiModello, AggiungiPrezzo, modello, marca, prezzo, conta);
                    conta++;
                    break;
                case 2:
                     System.out.println(funzioni.visualizzaTutto(marca, modello, prezzo, conta));
                     break;
                case 3:
                    System.out.println("dammi una marca");
                    AggiungiMarca = in.next();
                    System.out.println("dammi un modello");
                    AggiungiModello = in.next();
                    indice=funzioni.ricerca(AggiungiMarca, AggiungiModello, modello, marca, conta);
                    if(indice==-1)
                        System.out.println("non esistono marca e modello che coincidono");
                    else
                        System.out.println("L'auto esiste");
                        AggiungiPrezzo= prezzo[indice];
                        System.out.println(AggiungiMarca+" "+AggiungiModello+" "+AggiungiPrezzo);
                        break;

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