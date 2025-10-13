
/** En aquest exercici hauràs de desenvolupar un metge virtual “especialista” en refredats.
 *
 *  *El nostre metge, només té les següents regles que aplica en ordre:
 *
 *  *a) si el malalt presenta esternuts i mal de cap llavors, si té problemes d’estómac li recomanarà prendre paracetamol i si no en té li proposarà prendre àcid acetil salicílic (una aspirina, vaja).
 *
 *  *b) si el malalt ens diu que té tos llavors, si és massa jove (menor de 12 anys) li recomanarà un caramel de mel i altrament li proposarà un caramel d’eucaliptus.
 *
 *  *c) si no presenta cap dels anteriors símptomes, el metge proposarà al pacient que vingui a la seva consulta presencial per poder examinar-lo.  *
 * Considera les següents iteracions:
 *
 *  *Esternuts? (sí o no)
 * sí
 * Mal de cap? (sí o no)
 * sí
 * Problemes d'estómac? (sí o no)
 * no
 * Pren una aspirina.
 * Esternuts? (sí o no)
 * sí
 * Mal de cap? (sí o no)
 * no
 * Tos? (sí o no)
 * sí
 * Edat?
 * 10
 * Pren un carmel de mel
 * Esternuts? (sí o no)
 * no
 * Tos? (sí o no)
 * no
 * Vine a la consulta
 */
public class Metge {

    public static void main(String[] args) {
        System.out.println("Esternuts? (sí o no)");
        String resposta = Entrada.readLine();
        boolean tos = false;
        if (resposta.equals("sí")) {
            System.out.println("Mal de cap? (sí o no)");
            resposta = Entrada.readLine();
            if (resposta.equals("sí")) {
                System.out.println("Problemes d'estómac? (sí o no)");
                resposta = Entrada.readLine();
                if (resposta.equals("sí")) {
                    System.out.println("Pren paracetamol");
                } else {
                    System.out.println("Pren aspirina");
                }
            } else {
                System.out.println("Tos? (sí o no)");
                resposta = Entrada.readLine();
                if (resposta.equals("sí")) {
                    System.out.println("Edat?");
                    int edat = Integer.parseInt(Entrada.readLine());
                    if (edat < 12) {
                        System.out.println("Pren un carmel de mel");
                    } else {
                        System.out.println("Pren un carmel d'eucaliptus");
                    }
                } else {
                    System.out.println("Vine a la consulta");
                }
            }
        } else {
            System.out.println("Tos? (sí o no)");
            resposta = Entrada.readLine();
            if (resposta.equals("sí")) {
                System.out.println("Edat?");
                int edat = Integer.parseInt(Entrada.readLine());
                if (edat < 12) {
                    System.out.println("Pren un carmel de mel");
                } else {
                    System.out.println("Pren un carmel d'eucaliptus");
                }
            } else {
                System.out.println("Vine a la consulta");
            }
        }
    }
}
