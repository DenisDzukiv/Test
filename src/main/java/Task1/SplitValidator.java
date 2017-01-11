package Task1;


import java.util.ArrayList;

/**
 * Created by Денис on 09.01.2017.
 */
public class SplitValidator {
    public static String split(String ip) {
        String firstThreeNum = new String();

        for (int i = 0; i < ip.split("\\.", 4).length - 1; i++) {
            firstThreeNum = firstThreeNum + ip.split("\\.", 4)[i] + ".";
        }
        return firstThreeNum;
    }

    public static Integer oneLastNum(String ip, int getNumber) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ip.split("\\.", 4).length; i++) {
            list.add(Integer.parseInt(ip.split("\\.", 4)[i]));
        }
        return list.get(getNumber);
    }
}
