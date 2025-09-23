/*
* esto es una descripcion que no describe nada pero describe lo que no describe la descripcion que debe describir pero no lo debe
 */
public class CalculaArea {

    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        /*esto es un comentario*/
        System.out.println("Introduïu el radi:");
        String linia = Entrada.readLine();
        float radi = Float.parseFloat(linia);
        System.out.println("Introduïu les unitats (ex. cm):");
        String unitats = Entrada.readLine();
        float area = (float) Math.PI * radi * radi;
        System.out.println("L'àrea és " + area + " " + unitats + "²");
    }
}
