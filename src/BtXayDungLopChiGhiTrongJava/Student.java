package BtXayDungLopChiGhiTrongJava;

public class Student {
    private String name = "jone";
    private String classes = "C02";

    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getinfo() {
        return name + " " + classes;
    }
}
