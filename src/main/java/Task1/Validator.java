package Task1;

import java.util.regex.Pattern;

/**
 * Created by Денис on 09.01.2017.
 */
public class Validator {
    private static final String ipPattern
            = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
            + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public Pattern pattern;

    public Validator() {
        pattern = Pattern.compile(ipPattern);
    }

    public boolean validate(String ip) {
        return pattern.matcher(ip).matches();
    }

}
