package faculties.entities;

public class Faculty implements Comparable<Faculty> {
    private String FacultyName;
    private Integer MembersCount;
    private Double Price;


    public Faculty(String facultyName, Integer membersCount, Double price) {
        FacultyName = facultyName;
        MembersCount = membersCount;
        Price = price;
    }


    public String getFacultyName() {
        return FacultyName;
    }

    public Double getPrice() {
        return Price;
    }

    public Integer getMembersCount() {
        return MembersCount;
    }

    public void setFacultyName(String facultyName) {
        FacultyName = facultyName;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public void setMembersCount(Integer membersCount) {
        MembersCount = membersCount;
    }

    @Override
    public int compareTo(Faculty faculty) {
        return this.MembersCount - faculty.getMembersCount();
    }
}
