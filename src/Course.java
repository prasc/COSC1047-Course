public class Course {
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    if (numberOfStudents >= students.length) {
      String[] temp = new String[students.length * 2];
      System.arraycopy(students, 0, temp, 0, students.length);
      students = temp;
    }

    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    String[] newStudentsArray = new String[100];
    for (int i = 0; i < students.length; i++) {
      newStudentsArray[i] = students[i];
    }
    return newStudentsArray;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    String[] temp = new String[students.length];

    for (int index = 0; index < students.length; index++) {
      if(students[index] == student) {
        System.arraycopy(students, 0, temp, 0, index);
        System.arraycopy(students, index + 1, temp, index, students.length - index - 1);
        students = temp;
        numberOfStudents--;
      }
    }
  }
}
