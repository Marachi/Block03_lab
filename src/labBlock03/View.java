package labBlock03;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Славик on 08.05.2016.
 */
public class View {
    MyForm form;
    final String NAME_PATTERN = "\\D{1,15}";
    final String TEL_HOME_PATTERN = "\\+?3?8?(.)?(\\(|-)?(.)?(\\d{3})(\\))?(.)?\\d{2}(.|-)?\\d(.|-)?\\d(.|-)?\\d((.|-)?\\d((.|-)?\\d)?)?";
    final String TEL_MOBILE_PATTERN = "\\+?3?8?(.)?(\\(|-)?(.)?(\\d{3})(\\))?(.)?\\d{2}(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d";
    final String EMAIL_PATTERN = "^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    final String NICK_PATTERN = "^[A-Za-z0-9-.]{1,15}$";
    final String SCYPE_PATTERN = "\\w{1,15}";
    final String INDEX_PATTERN = "^\\d{5}$"; //
    final String CITY_PATTERN = "^\\D{1,15}$";//
    final String STREET_PATTERN = "(^[A-Za-z0-9-]{1,25}(\\s[A-Za-z0-9-]{1,25})?)$";//
    final String BUILDING_PATTERN = "^[A-Za-z0-9/-]{1,6}$";//
    final String APPARTMENT_PATTERN = "^[A-Za-z0-9/-]{1,6}$";//
    View(){
        form = new MyForm();

    }
}
