public class AnalitzaCaracter {
    public static void main(String[] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();

        if (text.isBlank() || text.length() < 1 || text.isEmpty()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int n = Integer.parseInt(Entrada.readLine());
            
            // Ajustar la posición según las reglas del enunciado
            int posicio = n % text.length();
            if (posicio < 0) {
                posicio = text.length() + posicio;
            }
            
            char c = text.charAt(posicio);
            
            if (Character.isDigit(c)) {
                System.out.println("'" + c + "'" + " és un dígit");
            } else if (Character.isLowerCase(c)) {
                System.out.println("'" + c + "'" + " és una lletra minúscula");
            } else if (Character.isUpperCase(c)) {
                System.out.println("'" + c + "'" + " és una lletra majúscula");
            } else {
                System.out.println("'" + c + "'" + " és altre");
            }
        }
    }
}
