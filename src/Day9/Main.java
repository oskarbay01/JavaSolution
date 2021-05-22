package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Tom","080");
        Teacher teacher = new Teacher("Anne","math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();


    }
}
