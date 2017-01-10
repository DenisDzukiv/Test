package Task2;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Есть программа, хранящая в памяти телефонную книгу (забита в коде программы).
 * Телефонная книга для каждого ФИО хранит список номеров.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        InputFio inFio = new InputFio();
        String inputFio = inFio.input();
        ArrayList<String> telephone = TelephoneUser.listTelephone(inputFio);
        print(telephone);
    }

    public static void print(ArrayList<String> telephone) {
        if (telephone.size() != 0) {
            for (int i = 0; i < telephone.size(); i++) {
                System.out.println(i + 1 + "." + telephone.get(i));
            }
        } else System.out.println("Такого ФИО в БД нет");
    }
}
