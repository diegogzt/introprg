
/**
 * Desenvolupa un programa que demani tres números i escrigui els tres números ordenats creixentment (de menor a major).
 */

public class TresEnOrdre {

    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        int mayor = primer;
        System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());
        if (segon > mayor) {
            mayor = segon;
        }
        System.out.println("Tercer?");
        int tercer = Integer.parseInt(Entrada.readLine());
        if (tercer > mayor) {
            mayor = tercer;
        } else if (primer > segon && primer > tercer) {
            mayor = primer;
        } else {
            mayor = tercer;
        }
        int menor = primer;
        if (segon < menor) {
            menor = segon;
        }
        System.out.println(primer + ", " +  segon + " i " + tercer);
    }
}
