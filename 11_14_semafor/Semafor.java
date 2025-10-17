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
            System.out.println("Corre");
        }
    }
}