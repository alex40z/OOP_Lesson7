import controller.Controller;
import model.*;
import view.Logger;
import view.View;

public class Main {
    public static void main(String[] args) {

        View view = new View();
        Model model = new CalcModel();
        Logger logger = new Logger();

        Controller controller = new Controller(view, model, logger);
        controller.dataProcessing();
    }
}
