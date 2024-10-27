import java.awt.Desktop;  //allows applications to launch the default web browser, mail client, or associated application.
import java.io.File;   //Imports the File class, used to interact with files and directories in the file system.
import java.io.IOException;  //Imports IOException, which handles input/output exceptions, such as when the file path is incorrect or an application isn’t found.

public class Main {
    public static void main(String[] args) {
        String filePath = new File("home.html").getAbsolutePath();
        if (!openWithDefaultBrowser(filePath)) {
            if (!openWithSpecificBrowser("C:\\Program File\\Google\\Chrome\\Application\\chrome.exe", filePath)) {  //Attempts to open home.html in the default browser using openWithDefaultBrowser. If unsuccessful (false), the code tries specific browsers.
                if (!openWithSpecificBrowser("C:\\Program File (x86)\\Microsoft\\Edge\\Application\\msedge.exe", filePath)) {
                    openWithSpecificBrowser("C:\\Program File\\Mozilla Firefox\\firefox.exe", filePath);
                }
            }
        }
    }
    
    private static boolean openWithDefaultBrowser(String filePath) {
        try {
            Desktop.getDesktop().browse(new File(filePath).toURI());  //Uses the Desktop class to open the file’s URI (home.html) in the default browser.
            return true;
        }
        catch (IOException e) {  //Catches any IOException
            return false;  
        }
    }
    private static boolean openWithSpecificBrowser(String browserPath, String filePath) {  //Uses the specified browser (given by browserPath) to open home.html.
        try {
            Process process = Runtime.getRuntime().exec(new String[]{browserPath, filePath});
            process.getErrorStream().close();
            return true;
         } catch (IOException e) {
            return false;
         

        }
    }
}