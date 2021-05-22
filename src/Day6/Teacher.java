package Day6;

import java.util.Random;

/* ${@Author} created on 06.04.2021 inside the package - Day6 */
public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random rand = new Random();
        int randomValue= rand.nextInt(4)+2;

        String evaluation="";
        switch (randomValue){
            case 2:
                evaluation="Неудовлетворительно";
                break;
            case 3:
                evaluation="удовлетворительно";
                break;
            case 4:
                evaluation="Хорошо";
                break;
            case 5:
                evaluation="Отлично";
                break;

        }
    }
}
