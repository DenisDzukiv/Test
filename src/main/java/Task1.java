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
            int lastIpBegin = split(ipBegin,3);
            String ipLast = reader.readLine();
            int lastIpLast = split(ipLast, 3);

            if (lastIpBegin<lastIpLast) {
                for (int i = 0; i<=(lastIpLast-lastIpBegin); i++){
                    lastIpBegin ++;
                    System.out.println(split(ipBegin,0)+ "." + split(ipBegin,1) + "." + split(ipBegin,2) + "." + lastIpBegin );
                }
            }
            else System.out.println("Поменяйте IP местами");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int split(String ip, int getNumber){

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<ip.split("\\.",4).length; i++) {
            list.add(Integer.parseInt(ip.split("\\.",4)[i]));
        }

        return list.get(getNumber);
    }
}
