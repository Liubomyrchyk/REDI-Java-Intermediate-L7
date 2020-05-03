package lesson_seven;

import java.util.ArrayList;

public class Student {
    String studentName;
    int age;
    boolean studentSingle;
    String studentCity;
    ArrayList<Student> studentFriends = new ArrayList<>();
    Student bestFriend;

    public Student(String studentName, int age, boolean studentSingle, String studentCity, ArrayList<Student> studentFriends, Student bestFriend) {
        this.studentName = studentName;
        this.age = age;
        this.studentSingle = studentSingle;
        this.studentCity = studentCity;
        this.studentFriends = studentFriends;
        this.bestFriend = bestFriend;
    }

    public Student(String studentName, int age, boolean studentSingle, String studentCity) {
        this.studentName = studentName;
        this.age = age;
        this.studentSingle = studentSingle;
        this.studentCity = studentCity;

    }

    private boolean isStudentAdded(Student student) {
        for (Student s : this.studentFriends) {
            if (s.studentName.equals(student.studentName))
                return true;
        }
        return false;
    }

    public void addFriend(Student student) {

        if (!studentName.equals(student.studentName) && !isStudentAdded(student)) {
            studentFriends.add(student);
        } else {
            System.out.println("you are adding yourself or the contact is already existed");
        }
    }

    public void addFriend(Student student, boolean isBestFriend) {
        if (!isBestFriend) {
            addFriend(student);
        }else if(bestFriend!=null){
            System.out.println("you have already added your best friend");
        }else {
            bestFriend=student;
            addFriend(student);
        }

    }

    public void introduce() {
        System.out.println("My name is " + studentName);
        System.out.println("I'm " + age + " years old");
        if (studentSingle) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.println("My friends are:");

        for (Student studentFriend : studentFriends) {
            System.out.println(studentFriend.studentName);
        }

        System.out.println("My Best friend is: " + bestFriend.studentName);
    }
}