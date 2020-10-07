public class CourseTestClass {
    public static void main(String[] args) {
        Course courseOne = new Course("Data Structures");

        courseOne.addStudent("PC");
        courseOne.addStudent("JD");
        courseOne.addStudent("AL");



        System.out.println("number of students in course one is " + courseOne.getNumberOfStudents());

        String[] students = courseOne.getStudents();

        for (int i = 0; i < courseOne.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
       courseOne.dropStudent("AL");

    }
}