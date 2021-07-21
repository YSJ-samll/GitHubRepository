package com.ysj;

import java.util.Objects;

/**
 * @Auther: ysj
 * @Date: 2021/7/19 - 16:27
 * @Description: com.ysj
 * @version: 1.0
 */
public class Student {

    private int Stu_no;
    private String Stu_name;
    private int Stu_age;

    public Student() {
    }

    public Student(int stu_no, String stu_name, int stu_age) {
        Stu_no = stu_no;
        Stu_name = stu_name;
        Stu_age = stu_age;
    }

    public int getStu_no() {
        return Stu_no;
    }

    public void setStu_no(int stu_no) {
        Stu_no = stu_no;
    }

    public String getStu_name() {
        return Stu_name;
    }

    public void setStu_name(String stu_name) {
        Stu_name = stu_name;
    }

    public int getStu_age() {
        return Stu_age;
    }

    public void setStu_age(int stu_age) {
        Stu_age = stu_age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Stu_no == student.Stu_no &&
                Stu_age == student.Stu_age &&
                Objects.equals(Stu_name, student.Stu_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Stu_no, Stu_name, Stu_age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Stu_no=" + Stu_no +
                ", Stu_name='" + Stu_name + '\'' +
                ", Stu_age=" + Stu_age +
                '}';
    }
}
