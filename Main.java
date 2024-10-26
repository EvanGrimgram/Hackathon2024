/* files: FashionTimeline.java, home.html */

public class Main {
    public static void main(String[] args) {
        FashionTimeline.main(args);

        /* Open the HTML file in a browser */
        try {
            java.awt.Desktop.getDesktop().browse(new java.io.File("index.html").toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}