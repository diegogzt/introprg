/*
 * Programa que recorda que els majors d'edat són responsables davant la
 * llei
 */
public class Preso {
    public static void main(String[] args) {
        System.out.println("Com us dieu?");
        String nom = Entrada.readLine();
        System.out.println("Quants anys teniu?");
        int edat = Integer.parseInt(Entrada.readLine());
        if (edat >= 18) {
            System.out.println(nom + ", sou major d'edat i responsable davant la llei.");
        }
        System.out.println("Gràcies per la informació, " + nom + ".");
    }
}