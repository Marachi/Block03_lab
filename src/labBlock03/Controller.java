package labBlock03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by potaychuk on 04.05.2016.
 */
public class Controller {

    private View view;
    private Model model;

    Controller(Model model, View view){
        this.view=view;
        this.model=model;
    }
    ArrayList<String> list = new ArrayList();
    void processUser(){
        view.jFrame.setVisible(true);
        view.jButton.addActionListener(new SubmitPreseed());

    }
    class  SubmitPreseed implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            list.add(view.nameFirstField.getText());
            list.add(view.nameSecondField.getText());
            list.add(view.nameThirdFieldx.getText());
            list.add(view.nickNameField.getText());
            list.add(view.telHomeField.getText());
            list.add(view.telWorkField.getText());
            list.add(view.scypeField.getText());
            list.add(view.emailField.getText());
            for (String s:list) {
                System.out.println(s);
            }
        }

    }
}
