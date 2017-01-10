package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * На вход программе задаются два IP адреса, программа перебирает все
 допустимые адреса в введенном диапазоне и выдает их на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ipBegin = reader.readLine();
            String ipLast = reader.readLine();
            Validator validatorBegin = new Validator();
            Validator validatorLast = new Validator();
            int startIp;
            int endIp;
            if (validatorBegin.validate(ipBegin)&&validatorLast.validate(ipLast)&&(SplitValidator.split(ipBegin).equals(SplitValidator.split(ipLast)))) {
                int lastIpBegin = SplitValidator.oneLastNum(ipBegin,3);
                int lastIpLast = SplitValidator.oneLastNum(ipLast,3);
                if (lastIpBegin < lastIpLast) {
                    startIp =  lastIpBegin;
                    endIp = lastIpLast;
                }
                else {
                    startIp =  lastIpLast;
                    endIp = lastIpBegin;
                }
                for (int i = startIp; i < (endIp - 1); i++) {
                    startIp++;
                    System.out.println(SplitValidator.split(ipBegin) + startIp);
                }

            }
            else {
                System.out.println("Некорректно введен IP адресс");
                System.exit(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
