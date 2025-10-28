/**
 * Considerem un ascensor d'un edifici amb planta baixa i dos pisos (primer pis i segon pis) que tingui els següents botons: 'pujar un', 'pujar dos', 'baixar un' i 'baixar dos'. L'ascensor es comporta, a partir dels botons esmentats, segons el següent diagrama de transició d'estats:

_images/esquemaascensor.png
Es demana desenvolupar un programa que simuli el funcionament d'aquest ascensor.

El programa demanarà el pis en que es troba i el botó que es prem, i mostrarà el nou pis.

Cal comprovar que els botons i les plantes siguin correctes. En cas que no ho siguin, el programa mostrarà un missatge d'error en comptes del nou pis.
 */

public class Ascensor {

    public static void main(String[] args) {

        System.out.println("pis?");
        String pisActual = Entrada.readLine();

        System.out.println("botó?");
        String botoPremt = Entrada.readLine();

        // Validar pis actual
        boolean pisValid = pisActual.equals("planta baixa") || 
                           pisActual.equals("primer pis") || 
                           pisActual.equals("segon pis");

        // Validar botó
        boolean botoValid = botoPremt.equals("pujar un") || 
                            botoPremt.equals("pujar dos") || 
                            botoPremt.equals("baixar un") || 
                            botoPremt.equals("baixar dos");

        if (!pisValid || !botoValid) {
            System.out.println("error");
        } else {
            String nouPis = pisActual;

            if (pisActual.equals("planta baixa")) {
                if (botoPremt.equals("pujar un")) {
                    nouPis = "primer pis";
                } else if (botoPremt.equals("pujar dos")) {
                    nouPis = "segon pis";
                } else {
                    nouPis = "error";
                }
            } else if (pisActual.equals("primer pis")) {
                if (botoPremt.equals("pujar un")) {
                    nouPis = "segon pis";
                } else if (botoPremt.equals("baixar un")) {
                    nouPis = "planta baixa";
                } else {
                    nouPis = "error";
                }
            } else if (pisActual.equals("segon pis")) {
                if (botoPremt.equals("baixar un")) {
                    nouPis = "primer pis";
                } else if (botoPremt.equals("baixar dos")) {
                    nouPis = "planta baixa";
                } else {
                    nouPis = "error";
                }
            }

            if (nouPis.equals("error")) {
                System.out.println("error");
            } else {
                System.out.println(nouPis);
            }
        }
    }
}

