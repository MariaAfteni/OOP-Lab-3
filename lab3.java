import static java.lang.System.out;
//import static java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import java.util.ArrayList;

public class System {
    public static void main(String[] args) {

        // Random rand = new Random();
        // out.print("\n-------------------------------------------------");
        // Assignment a1 = new Assignment();
        // a1.due_assignment();
        // a1.submit_assignment();

        // Grade g1 = new Grade();
        // g1.gradded_assignment();

    }

}

class Log {
    String user;
    String username;
    private String password;

    void log_in(String user_name) {
        out.print("\nThe user " + user_name + " logged into account");
    }

    void log_out(String user_name) {
        out.print("\nThe user " + user_name + " logged out of the account");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class User extends Log {
    String type;
    String name;

    void view_course(String course_name) {
        out.print("\nUser " + name + " viewed " + course_name + " course");
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}

class Teacher extends User {

    String course;

    void assignment(String name_course) {
        out.print("\nTeacher " + name + " added an assignment to the " + name_course + " course");
    }

    void grade_assignment(String student_name, String course_name) {
        out.print("\nTeacher " + name + " gradded the assignment of " + student_name + " student for the " + course_name
                + " course");
    }

    void attendence(String student_name, String attendance_status) {
        out.print("\nTeacher " + name + " recorded that student " + student_name + " is " + attendance_status);
    }
}

class Student extends User {

    int total_credits;

    void enroll(String course_name) {
        out.print("\nStudent " + name + " has enrolled to the " + course_name + " course");
    }

    void assignment(String course_name) {
        out.print("\nStudent " + name + " submitted the assignment at " + course_name + " course");
    }
}

class Admin extends User {
    int ID;

    void add_course(String course_name) {
        out.print("\nAdmin " + name + " added " + course_name + " to courses");
    }

    void edit_course(String course_name) {
        out.print("\nAdmin " + name + " edited " + course_name + " course");
    }

    void delete_course(String course_name) {
        out.print("\nAdmin " + name + " deleted " + course_name + " from courses");
    }

    void add_student(String student_name, String course_name) {
        out.print("\nAdmin " + name + " added " + student_name + " to the " + course_name + " course");
    }

    void delete_student(String student_name, String course_name) {
        out.print("\nAdmin " + name + " deleted " + student_name + " from " + course_name + " course");
    }

}

class University {
    String name;
    String type; // private or public
}

class Faculty extends University {
    String faculty_name;
    int total_students;

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public int getTotal_students() {
        return total_students;
    }

    public void setTotal_students(int total_students) {
        this.total_students = total_students;
    }

    final String[] faculties = { "FCIM", "FMIT", "FEE", "FET" };

}

class Course extends Faculty {
    String course_name;
    int nr_credits;
    String teacher;

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setNr_credits(int nr_credits) {
        this.nr_credits = nr_credits;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

}

class Resources extends Course {
    String type;

    void add_resource(String teacher_name) {
        out.print("\nThe teacher " + teacher_name + " added " + type + " to the " + course_name + " course");
    }

    void download_resource(String student_name) {
        out.print("\nThe student " + student_name + " downloaded the " + course_name + " " + type);
    }
}

class Assignment extends Course {
    int duehour;
    int submithour;
    // Random rand = new Random();

    // void due_assignment() {
    // duehour = random.nextInt(24);
    // out.print("\nAssignment due hour " + duehour);
    // }

    // void submit_assignment() {
    // submithour = random.nextInt(24);
    // out.print("\nTAssignment submitted at " + submithour);
    // }

}

class Grade extends Assignment {
    int grade;
    // Random rand = new Random();
    int fgrade;

    void gradded_assignment() {
        grade = ThreadLocalRandom.current().nextInt(11);
        if (submithour > duehour) {
            fgrade = grade - 1;
        } else {
            fgrade = grade;
        }
        out.print("\nAssignment was graded. Grade - " + fgrade);
    }
}
