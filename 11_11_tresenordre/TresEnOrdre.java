
/**
 * Desenvolupa un programa que demani tres números i escrigui els tres números ordenats creixentment (de menor a major).
 */

public class TresEnOrdre {

    public static void main(String[] args) {
        //primer?
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
        
        System.out.println("Segon?");//segon?
        int segon = Integer.parseInt(Entrada.readLine()); 
        
        System.out.println("Tercer?"); //tercer?
        int tercer = Integer.parseInt(Entrada.readLine());
        
        // Find the smallest number
        int menor = primer;
        if (segon < menor) {
            menor = segon;
        }
        if (tercer < menor) {
            menor = tercer;
        }
        
        // Find the largest number
        int mayor = primer;
        if (segon > mayor) {
            mayor = segon;
        }
        if (tercer > mayor) {
            mayor = tercer;
        }
        
        // Find the middle number
        int medio = primer + segon + tercer - menor - mayor;
        
        System.out.println(menor + ", " + medio + " i " + mayor);
    
    }
}
