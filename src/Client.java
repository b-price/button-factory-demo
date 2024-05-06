public class Client {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        run();
    }
    static void configure(){
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }
    static void run(){
        dialog.renderWindow();
    }
}