import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = new File("home.html").getAbsolutePath();
        if (!openWithDefaultBrowser(filePath)) {
            if (!openWithSpecificBrowser("C:\\Program File\\Google\\Chrome\\Application\\chrome.exe", filePath)) {
                if (!openWithSpecificBrowser("C:\\Program File (x86)\\Microsoft\\Edge\\Application\\msedge.exe", filePath)) {
                    openWithSpecificBrowser("C:\\Program File\\Mozilla Firefox\\firefox.exe", filePath);
                }
            }
        }
    }
    
    private static boolean openWithDefaultBrowser(String filePath) {
        try {
            Desktop.getDesktop().browse(new File(filePath).toURI());
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
    private static boolean openWithSpecificBrowser(String browserPath, String filePath) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{browserPath, filePath});
            process.getErrorStream().close();
            return true;
         } catch (IOException e) {
            return false;
         

        }
    }
}