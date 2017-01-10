package Task2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Денис on 10.01.2017.
 */
public class TelephoneUser {
    public static ArrayList<String> listTelephone(String inputFio){
        ArrayList<String> telephone = new ArrayList<String>();
        HashMap<String, String > phonebook = SetPhonebook.mapphone();
        for (HashMap.Entry<String,String> entry : phonebook.entrySet()) {
            if (entry.getValue().toUpperCase().trim().equals(inputFio)) {
                telephone.add(entry.getKey());
            }
        }
        return telephone;
    }
}
