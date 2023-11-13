package ua.ucu.edu.apps;

import java.util.List;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public class Student extends User {
    @Singular
    private List<Integer> grades;
}
