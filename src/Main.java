import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void createAndShowGUI() throws Exception {
        new View();
    }
}
