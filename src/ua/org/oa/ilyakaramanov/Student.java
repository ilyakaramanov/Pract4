package ua.org.oa.ilyakaramanov;

import java.util.Objects;

public class Student {


    public static final double NAME_MIN_LENGTH = 4;
    public static final double NAME_MAX_LENGTH = 50;
    public static final double AGE_MIN=16;
    public static final double AGE_MAX=60;
    private String name;
    private int age;

    public Student(String name, int age) throws CustomException {
        setName(name);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomException {
        if (name.length() > NAME_MIN_LENGTH && name.length() < NAME_MAX_LENGTH) {
            this.name = name;
        } else {
            throw new CustomException("Имя в диапазоне от "+ NAME_MIN_LENGTH + " до " + NAME_MAX_LENGTH + " символов.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CustomException {
        if (age >= AGE_MIN && age < AGE_MAX) {
            this.age = age;
        } else {
            throw new CustomException("Возраст студента в диапазоне от "+ AGE_MIN + " до " + AGE_MAX + " лет.");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}
