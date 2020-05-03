package lesson_seven;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student bob= new Student("Bob", 36, false, "Berlin");
        Student jane= new Student("Jane", 36, false, "Berlin");
        Student john= new Student("John", 36, true, "Berlin");
        Student alice = new Student("Alice", 36, true, "Berlin");

        bob.addFriend(jane);
        bob.addFriend(john);
        alice.addFriend(bob, true);
        alice.addFriend(alice);
        alice.addFriend(bob);
        bob.addFriend(alice, true);

        alice.introduce();
        bob.introduce();

    }

}