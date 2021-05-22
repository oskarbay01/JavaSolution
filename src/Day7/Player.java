package Day7;


public class Player {
    private int stamina;

    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers<6)
            countPlayers++;
    }

    public void run() {
        if (stamina == 0)
            return;//выходим из условий
        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    /* info() - выводит сообщение в зависимости от количества игроков на поле. Если
      игроков меньше 6, то выводит сообщение: “Команды неполные. На поле еще есть ...
      свободных мест”, иначе: “На поле нет свободных мест”. Грамматикой русского языка
      пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
    */
    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные.На поле еще есть " + (6 - countPlayers) + " cвободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
