package faculties.beans;

import faculties.entities.Faculty;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IFacultyLocal {
    void Add(Faculty faculty);
    List<Faculty> all();
    List<Faculty> lessStudents(int count);
    Double calculate(String facultyName, int terms);
}
