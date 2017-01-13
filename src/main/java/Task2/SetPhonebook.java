package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Денис on 10.01.2017.
 */
public class SetPhonebook {
    public static HashMap<String, List<String>> mapphone() {
        HashMap<String, List<String>> phonebook = new HashMap<String, List<String>>();
        List<String> listPhone = new ArrayList<String>();
        listPhone.add("+8 800 200 600");
        listPhone.add("+8 800 200 600");
        phonebook.put("Иванов И.И.", listPhone);
        listPhone = new ArrayList<String>();
        listPhone.add("8 800 2000 700");
        phonebook.put("Петров П.П.", listPhone);
        listPhone = new ArrayList<String>();
        listPhone.add("+8 800 2000 000");
        listPhone.add("+8 800 2000 900");
        listPhone.add("+8 800 2000 800");
        phonebook.put("Сидоров С.С.", listPhone);
        return phonebook;
    }
}
