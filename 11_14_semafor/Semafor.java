/**
 * Desenvolupem un ajudant per decidir que fer davant un semàfor ('vermell', verd o groc). 
 * El programa demanarà de quin color està el semàfor i segons la
 *  resposta recomanarà respectivament 'espera', passa, o corre! (sí, no és un assistent massa responsable).
 */
public class Semafor {
    public static void main(String[] args) {
        System.out.println("Color?");
        String color = Entrada.readLine();
        boolean vermell = color.equals("vermell");
        boolean verd = color.equals("verd"); 
        boolean groc = color.equals("groc");
        if(vermell){
            System.out.println("Para");
        }
        else if(verd){
            System.out.println("Avança");
        }
        else if(groc){
            System.out.println("Corre!");
        }
    }
}