package org.example;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        User user1 = new User(1, "karina", "karinakokosova8@gmail.com", "234");
        User user2 = new User(2, "ella", "ella5@gmail.com", "232345");
        User user3 = new User(2, "fjebk", "whbh@gmail.com", "2789");

        db.authorize("karina", "234");





    }
}

