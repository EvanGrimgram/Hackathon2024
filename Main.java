/* files: home.html...  FashionTimeline.java is dead */

public class Main {
    public static void main(String[] args) {
        /* FashionTimeline.main(args); dead code */

        /* Open the HTML file in a browser */
        try {
            java.awt.Desktop.getDesktop().browse(new java.io.File("home.html").toURI());
        } catch (Exception e) {
            e.printStackTrace(); //nbvngg
        }
    }
}