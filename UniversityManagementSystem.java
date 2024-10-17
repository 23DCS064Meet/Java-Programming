import java.util.ArrayList;
import java.util.Scanner;

class University {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Teacher> teachers;
    
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Add a student to the university
    public void addStudent(String studentName, int studentId) {
        students.add(new Student(studentName, studentId));
        System.out.println("\n------------------------------------------");
    }

    // Remove a student from the university
    public void removeStudent(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            students.remove(student);
            System.out.println("Student " + student.getName() + " removed.");
        } else {
            System.out.println("Student not found.");
        }
        System.out.println("\n------------------------------------------");
    }

    // Add a course to the university
    public void addCourse(String courseName, int courseId) {
        courses.add(new Course(courseName, courseId));
    }

    // Display all courses
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("List of Courses:");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
        System.out.println("\n------------------------------------------");
    }

    // Enroll student in a course
    public void enrollStudentInCourse(int studentId, int courseId) {
        Student student = findStudentById(studentId);
        Course course = findCourseById(courseId);

        if (student != null && course != null) {
            student.enrollCourse(course);
            course.addStudent(student);
            System.out.println("Student " + student.getName() + " enrolled in course " + course.getCourseName());
        } else {
            System.out.println("Invalid student or course ID.");
        }
        System.out.println("\n------------------------------------------");
    }

    // Add a teacher to the university
    public void addTeacher(String teacherName, int teacherId) {
        teachers.add(new Teacher(teacherName, teacherId));
    }
    

    // Remove a teacher from the university
    public void removeTeacher(int teacherId) {
        Teacher teacher = findTeacherById(teacherId);
        if (teacher != null) {
            teachers.remove(teacher);
            System.out.println("Teacher " + teacher.getName() + " removed.");
        } else {
            System.out.println("Teacher not found.");
        }
        System.out.println("\n------------------------------------------");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
                student.displayEnrolledCourses();
                student.displayAttendance();
            }
        }
    }

    // Display all teachers
    public void displayTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("No teachers available.");
        } else {
            System.out.println("List of Teachers:");
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
                teacher.displayAttendance();
            }
        }
        System.out.println("\n------------------------------------------");
    }

    // Mark attendance for a student
    public void markStudentAttendance(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.markAttendance();
        } else {
            System.out.println("Student not found.");
        }
        System.out.println("\n------------------------------------------");
    }

    // Mark attendance for a teacher
    public void markTeacherAttendance(int teacherId) {
        Teacher teacher = findTeacherById(teacherId);
        if (teacher != null) {
            teacher.markAttendance();
        } else {
            System.out.println("Teacher not found.");
        }
        System.out.println("\n------------------------------------------");
    }

    // Find student by ID
    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    // Find course by ID
    private Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    // Find teacher by ID
    private Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == id) {
                return teacher;
            }
        }
        return null;
    }
}

class Student {
    private String name;
    private int studentId;
    private ArrayList<Course> enrolledCourses;
    private int attendanceCount;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        this.attendanceCount = 0;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void markAttendance() {
        attendanceCount++;
        System.out.println("Attendance marked for student: " + name);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void displayEnrolledCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            System.out.println("Enrolled Courses:");
            for (Course course : enrolledCourses) {
                System.out.println(course);
            }
        }
        System.out.println("\n------------------------------------------");
    }

    public void displayAttendance() {
        System.out.println("Attendance for " + name + ": " + attendanceCount + " days.");
        System.out.println("\n------------------------------------------");
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name;
    }
}

class Teacher {
    private String name;
    private int teacherId;
    private int attendanceCount;

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.attendanceCount = 0;
    }

    public void markAttendance() {
        attendanceCount++;
        System.out.println("Attendance marked for teacher: " + name);
        System.out.println("\n------------------------------------------");
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public void displayAttendance() {
        System.out.println("Attendance for " + name + ": " + attendanceCount + " days.");
        System.out.println("\n------------------------------------------");
    }

    @Override
    public String toString() {
        return "Teacher ID: " + teacherId + ", Name: " + name;

    }
}

class Course {
    private String courseName;
    private int courseId;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        University university = new University("XYZ University");

        while (true) {
            System.out.println("\n------------------------------------------");
            System.out.println("\nUniversity Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Add Course");
            System.out.println("4. Enroll Student in Course");
            System.out.println("5. Add Teacher");
            System.out.println("6. Remove Teacher");
            System.out.println("7. Mark Student Attendance");
            System.out.println("8. Mark Teacher Attendance");
            System.out.println("9. Display Students");
            System.out.println("10. Display Teachers");
            System.out.println("11. Display Courses");
            System.out.println("12. Exit");
            System.out.print("Choose an option: ");
            System.out.println("\n------------------------------------------");
            int option = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    scanner.nextLine(); // consume newline
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    university.addStudent(studentName, studentId);
                    break;
                case 2:
                    System.out.print("Enter Student ID to Remove: ");
                    int removeStudentId = scanner.nextInt();
                    university.removeStudent(removeStudentId);
                    break;
                case 3:
                    System.out.print("Enter Course Name: ");
                    scanner.nextLine(); // consume newline
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    university.addCourse(courseName, courseId);
                    break;
                case 4:
                    System.out.print("Enter Student ID: ");
                    int sid = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int cid = scanner.nextInt();
                    university.enrollStudentInCourse(sid, cid);
                    break;
                case 5:
                    System.out.print("Enter Teacher Name: ");
                    scanner.nextLine(); // consume newline
                    String teacherName = scanner.nextLine();
                    System.out.print("Enter Teacher ID: ");
                    int teacherId = scanner.nextInt();
                    university.addTeacher(teacherName, teacherId);
                    break;
                case 6:
                    System.out.print("Enter Teacher ID to Remove: ");
                    int removeTeacherId = scanner.nextInt();
                    university.removeTeacher(removeTeacherId);
                    break;
                case 7:
                    System.out.print("Enter Student ID: ");
                    int studentAttendId = scanner.nextInt();
                    university.markStudentAttendance(studentAttendId);
                    break;
                case 8:
                    System.out.print("Enter Teacher ID: ");
                    int teacherAttendId = scanner.nextInt();
                    university.markTeacherAttendance(teacherAttendId);
                    break;
                case 9:
                    university.displayStudents();
                    break;
                case 10:
                    university.displayTeachers();
                    break;
                case 11:
                    university.displayCourses();
                    break;
                case 12:
                    System.out.println("Exiting system...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
}
}
}