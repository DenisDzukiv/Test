package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Денис on 10.01.2017.
 */
public class InputFio {
    public String input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fio = reader.readLine().toUpperCase().trim();
        return fio;
    }
}
