package ua.ucu.edu.apps;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}
@ToString
@SuperBuilder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}