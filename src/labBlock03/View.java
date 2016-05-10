package labBlock03;

import java.util.regex.Pattern;

/**
 * Created by Славик on 08.05.2016.
 */
public class View {
    MyForm form;
    Pattern namePattern = Pattern.compile("\\D{1,15}");
    Pattern telHomePattern = Pattern.compile("\\+?3?8?(.)?(\\(|-)?(.)?(\\d{3})(\\))?(.)?\\d{2}(.|-)?\\d(.|-)?\\d(.|-)?\\d((.|-)?\\d((.|-)?\\d)?)?");
    Pattern telMobilePattern = Pattern.compile("\\+?3?8?(.)?(\\(|-)?(.)?(\\d{3})(\\))?(.)?\\d{2}(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d");
    Pattern emailPattern = Pattern.compile("^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    View(){
        form = new MyForm();
    }
}
