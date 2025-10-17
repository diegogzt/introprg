
import javax.sql.rowset.spi.SyncFactory;

/**Desenvolupa un programa que simuli una transacció amb la quantitat a pagar i la pagada, de manera que el programa indiqui si sobren o falten diners.

El programa demanarà el preu en € i la quantitat de € pagada. A continuació compararà les dues quantitats i escriurà els € que falten per pagar o bé els que se han de tornar.

Exemple d'interacció:

java Pagament
Preu?
102
Paga?
150
Sobren 48€
java Pagament
Preu?
102
Paga?
100
Falten 2€
java Pagament
Preu?
100
Paga?
100
No sobra ni falta res
 */

 public class Pagament {
    public static void main(String[] args) {
        System.out.println("Preu?");
        
        int preu = Integer.parseInt(Entrada.readLine());
        System.out.println("Paga?");
        int paga = Integer.parseInt(Entrada.readLine());
        int resultat = paga-preu;
        if(resultat < 0){
            System.out.println("Falten "+ (resultat + resultat)+"€");
        }
        else if(resultat > 0){
            System.out.println("Sobren "+resultat+"€");
        }
        else{
            System.out.println("No sobra ni falta res");
        }
    }
 }