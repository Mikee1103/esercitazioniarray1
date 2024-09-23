package concessionario;
public class funzioni {
    public static void aggiunta (String AggiungiMarca, String AggiungiModello, double AggiungiPrezzo, String[] modello, String[] marca, double[] prezzo, int conta){
        modello[conta]= AggiungiModello;
        marca[conta]=AggiungiMarca;
        prezzo[conta]=AggiungiPrezzo;
    }
    public static int ricerca (String AggiungiMarca, String AggiungiModello, String[] modello, String[] marca, int conta) {
        for (int i = 0; i < conta; i++) {
            if (AggiungiMarca.equals(marca[i]) && (AggiungiModello.equals(modello[i]))) {
                return i;
            }
        }
        return -1;
    }
    public static String visualizzaTutto(String[] marca, String[] modello, double[] prezzo, int conta){
        String tutto= "";
        for(int i=0; i<conta; i++){
            tutto+= marca[i]+" "+modello[i]+" "+prezzo[i]+"\n";
        }
        return tutto;
    }
}
