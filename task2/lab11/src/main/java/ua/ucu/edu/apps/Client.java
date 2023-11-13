package ua.ucu.edu.apps;

public class Client {
    private static int isCounter = 0;
    private int id;
    private String name;
    private int age;
    private String sex;

    public Client(String name, int age, String sex) {
        this.id = isCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
