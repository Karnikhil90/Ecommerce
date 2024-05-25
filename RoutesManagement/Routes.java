package RoutesManagement;

public class Routes {

    public void ViewProduct() {

    }

    public void clear() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("ErrorType: clearing the screen: " + e.getMessage());
        }
    }
}
