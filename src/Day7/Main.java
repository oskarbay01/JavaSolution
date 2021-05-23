package Day7;

/**
 * Дворовый футбол.
 * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player ),
 * содержит следующие поля:
 * - поле “выносливость” (англ. stamina ), разное для каждого экземпляра
 * - константы “максимальная выносливость” (англ. MAX_STAMINA ) со значением
 * 100 и “минимальная выносливость” (англ. MIN_STAMINA ) со значением 0,
 * единые для всех экземпляров
 * - статическое поле countPlayers , которое считает количество игроков на
 * футбольном поле (изначально их 0, выходом на поле считается создание
 * экземпляра класса, уходом - когда игрок устал).
 * - геттер для поля “выносливость”
 */

public class Main {
    public static void main(String[] args) {
       Player player1= new Player(90);
       Player player2= new Player(99);
       Player player3= new Player(92);

       Player.info();

       Player player4= new Player(96);
       Player player5= new Player(100);
       Player player6= new Player(97);

       player1.run();
       player3.run();


    }
}
