package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Денис on 10.01.2017.
 */
public class TelephoneUser {
    public static List<String> listTelephone(String inputFio) {
        List<String> telephone = new ArrayList<String>();
        HashMap<String, List<String>> phonebook = SetPhonebook.mapphone();
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {
            if (entry.getKey().toUpperCase().trim().equals(inputFio)) {
                telephone = entry.getValue();
            }
        }
        return telephone;
    }
}
