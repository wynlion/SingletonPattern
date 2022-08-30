package singletonpattern;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        Database database = Database.getInstance("db_music");
        System.out.println(database.toString());
    }
}
