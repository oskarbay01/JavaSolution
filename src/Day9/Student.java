package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public class Student extends Human{
    private String groupName;

    public Student(String name,String groupName){
        super(name);
        this.groupName=groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void printInfo(){
        System.out.println("Этот студент с именем "+name);
    }
}
