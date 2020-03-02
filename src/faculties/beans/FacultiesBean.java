package faculties.beans;

import faculties.entities.Faculty;

import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class FacultiesBean implements IFacultyLocal{

    private List<Faculty> faculties;


    public FacultiesBean() {
        faculties = new ArrayList<>();
    }


    @Override
    public void Add(Faculty faculty) {
        for (Faculty f : faculties) {
            if (f.getFacultyName().equals(faculty.getFacultyName())){
                return;
            }
        }

        faculties.add(faculty);
    }

    @Override
    public List<Faculty> all() {
        return new ArrayList<>(faculties);
    }

    @Override
    public List<Faculty> lessStudents(int count) {
        return faculties.subList(0, count);
    }

    @Override
    public Double calculate(String facultyName, int terms) {

        Faculty correspondingFaculty = null;
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyName().equals(facultyName)) {
                correspondingFaculty = faculty;
                break;
            }
        }

        return correspondingFaculty.getPrice() * terms;
    }
}
