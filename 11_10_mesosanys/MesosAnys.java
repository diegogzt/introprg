/* Desenvolupa un programa que demani un mes i un any, i escrigui el mes anterior i el mes següent.
SAfposidnbjkañefoibosvjdkñ afnejpsdknvj ñasdnjp´dnñnl
ainlsdbjkñv nkñlj nfvdkn´lmñfvm
*/

public class MesosAnys {
    public static void main(String[] args) {
        System.out.println("Mes?");
        int mes = Integer.parseInt(Entrada.readLine());
        System.out.println("Any?");
        int any = Integer.parseInt(Entrada.readLine());
        // Calcular mes anterior
        int mesAnterior = mes - 1;
        int anyAnterior = any;
        if (mesAnterior == 0) {
            mesAnterior = 12;
            anyAnterior = any - 1;
        }

        // Calcular mes següent
        int mesSeguent = mes + 1;
        int anySeguent = any;
        if (mesSeguent == 13) {
            mesSeguent = 1;
            anySeguent = any + 1;
        }

        System.out.println("Mes anterior " + mesAnterior + "/" + anyAnterior + " i mes següent " + mesSeguent + "/" + anySeguent);
    }
}