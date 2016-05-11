package labBlock03;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        View view = new View();
        Model model = new Model();

        Controller controller = new Controller(model,view);
        controller.processUser();

    }
}
