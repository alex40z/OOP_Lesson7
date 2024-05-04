package view;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    public void save(String calculation) {
        try (FileWriter writer = new FileWriter("calculator.log", true)) {
            writer.write(calculation + "\n");
            writer.flush();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
