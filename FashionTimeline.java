import java.io.FileWriter;
import java.io.IOException;

public class FashionTimeline {
    public static void main(String[] args) {
        String[] periods = {
            "1000", "1200", "1400", "1600", "1800",
            "2000", "2200", "2400", "2600", "2800", "3000"
        };

        String[] descriptions = {
            "Description for 1000", "Description for 1200", "Description for 1400",
            "Description for 1600", "Description for 1800", "Description for 2000",
            "Description for 2200", "Description for 2400", "Description for 2600",
            "Description for 2800", "Description for 3000"
        };

        try (FileWriter writer = new FileWriter("home.html", true)) {
            for (int i = 0; i < periods.length; i++) {
                writer.write("<div class='timeline-section'>\n");
                writer.write("<h2 onclick=\"toggleDescription('desc" + i + "')\">" + periods[i] + "</h2>\n");
                writer.write("<div id='desc" + i + "' class='description'>\n");
                writer.write("<p>" + descriptions[i] + "</p>\n");
                writer.write("<img src='image" + i + ".jpg' alt='" + periods[i] + " fashion'>\n");
                writer.write("</div>\n");
                writer.write("</div>\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
