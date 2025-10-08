/*
 * Programa que ordena dos nombres
 */
public class DosEnOrdre {

    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        int segon = Integer.parseInt(Entrada.readLine());

        if (primer > segon) {
            int comodin = segon;
            segon = primer;
            segon = comodin;
        }
        /* █████ compara el primer i el segon, i amb una instrucció
                 condicional amb if i else mostra el missatge
                 corresponent.
                 Pista: un dels missatges podria ser escrit amb:
         */
        System.out.println(primer + " i " + segon);
    }
}
