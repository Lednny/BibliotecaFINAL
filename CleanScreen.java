public class CleanScreen {
    public static void main(String[] args) {
    }

    public static void CleanScreen() {
        try {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        } catch (Exception e) {
        System.out.println("Error al limpiar la pantalla.");
        }
    }
}
