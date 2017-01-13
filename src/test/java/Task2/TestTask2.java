package Task2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Денис on 10.01.2017.
 */
public class TestTask2 {
    private static final ArrayList<String> fio = new ArrayList<String>();

    @BeforeClass
    public static void setFio(){
        fio.add("Иванов И.И.");
        fio.add("  Иванов И.И.  ");
        fio.add("иванов и.и.");
        fio.add("Жуков И.И.");
        fio.add("Сидоров С.С.");
    }

    @Test
    public void testListTelephone(){
        System.out.println("");
        System.out.println("Тестирование метода listTelephone класса TelephoneUser:");
        List<String> list = new ArrayList<String>();
        for (int i =0; i<fio.size(); i++) {
            System.out.println(fio.get(i));
            list = TelephoneUser.listTelephone(fio.get(i).toUpperCase().trim());
            System.out.println(list);
            Task2.print(list);
        }
    }

}
