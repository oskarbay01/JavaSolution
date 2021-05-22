package Day9;

/* ${@Author} created on 08.04.2021 inside the package - PACKAGE_NAME */
public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printinfo(){
        System.out.println("Это человек с именем "+name);
    }
}
