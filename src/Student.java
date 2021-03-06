import java.util.ArrayList;
/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    boolean fulltime;
    ArrayList<Course> courseList;

    public Student(String name, String emailAddress, String major) {
        super(name, emailAddress);
        this.major = major;
        this.fulltime = fulltime;
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }

    public void addCourse(Course c)
    {
        if (this.courseList == null)
        {
         this.courseList =  new ArrayList<Course>();
        }
        this.courseList.add(c);
    }
}
