package Day9;

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
