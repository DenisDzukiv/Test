package Task1;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by Денис on 10.01.2017.
 */
public class TestTask1 {
    private static String ipBegin = new String();
    private static String ipEnd = new String();
    private static final HashMap<String, Integer > ip = new HashMap<String, Integer>();

    @BeforeClass
    public static void setIp(){
        ipBegin = "192.168.10";
        ipEnd = "192.168.10.9";
        ip.put("192.168.10.1", 1);
        ip.put("192.168.10.5", 2);
        ip.put("192.168.10.9", 1);
        ip.put("192.168.10.2", 2);
        ip.put("192.168.10", 1);
        ip.put("192.168.10.3", 2);
        ip.put("192.250.10.1", 1);
        ip.put("192.168.10.3", 2);
        ip.put("", 1);
        ip.put("192.168.10.3", 2);

    }


    @Test
    public void testValidate(){
        System.out.println("");
        Validator valid = new Validator();
        System.out.println("Тестирование метода validate класса Validator:");
        for (HashMap.Entry<String,Integer> entry : ip.entrySet()) {
            if (!valid.validate(entry.getKey())) System.out.println(entry.getKey() + " - Некорректно введен IP адресс ");
            else System.out.println(entry.getKey() + " - IP адресс корректный");
        }

    }

    @Test
    public void testSplit(){
        System.out.println("");
        SplitValidator spl = new SplitValidator();
        System.out.println("Тестирование метода split класса SplitValidator:");
        for (HashMap.Entry<String,Integer> entry : ip.entrySet()) {
            System.out.println(spl.split(entry.getKey()));
        }

    }

    @Test(expected = Exception.class)
    public void testOneLastNum(){
        System.out.println("");
        SplitValidator spl = new SplitValidator();
        System.out.println("Тестирование метода oneLastNum класса SplitValidator:");
        for (HashMap.Entry<String,Integer> entry : ip.entrySet()) {
            System.out.println(entry.getKey() + "-" + spl.oneLastNum(entry.getKey(),3));
        }
    }

    @Test
    public void testMain(){
        System.out.println("");
        System.out.println("Тестирование метода main класса Task1:");
        Task1.main(new String[] { ipBegin, ipEnd });
    }
}
