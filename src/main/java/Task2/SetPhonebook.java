package Task2;

import java.util.HashMap;

/**
 * Created by Денис on 10.01.2017.
 */
public class SetPhonebook {
    public static HashMap<String, String> mapphone(){
        HashMap<String, String> phonebook = new HashMap<String, String>();
        phonebook.put("+8 800 200 600", "Иванов И.И.");
        phonebook.put("+8 800 200 500" , "Иванов И.И.");
        phonebook.put("+8 800 2000 700" , "Петров П.П.");
        phonebook.put("+8 800 2000 000" , "Сидоров С.С.");
        phonebook.put("+8 800 2000 900" , "Сидоров С.С.");
        phonebook.put("+8 800 2000 800" , "Сидоров С.С.");
        return phonebook;
    }

}
