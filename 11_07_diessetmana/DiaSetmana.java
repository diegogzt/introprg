public class DiaSetmana {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num <1 || num >7){
            System.out.println("Error");
        }
        else if(num == 1){
            System.out.println("Dilluns");
        }
        else if(num == 2){
            System.out.println("Dimarts");
        }
        else if(num == 3){
            System.out.println("Dimecres");
        }
        else if(num == 4){
            System.out.println("Dijous");
        }
        else if(num == 5){
            System.out.println("Divendres");
        }
        else if (num == 6) {
            System.out.println("Dissabte");
        }
        else if (num == 7) {
            System.out.println("Diumenge");
        }

    }
}