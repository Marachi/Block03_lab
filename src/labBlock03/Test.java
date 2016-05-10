package labBlock03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Славик on 08.05.2016.
 */
public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\+?3?8?(.)?(\\(|-)?(.)?(\\d{3})(\\))?(.)?\\d{2}(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d(.|-)?\\d");
        Matcher matcher = pattern.matcher("098-88-29-027");
        System.out.println(matcher.matches());
    }
}
