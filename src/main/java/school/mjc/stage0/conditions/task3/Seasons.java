package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month > 0 && month < 4) {
            System.out.println("Winter");
        } else if (month >= 4 && month < 6) {
            System.out.println("Spring");
        } else if (month >= 6 && month < 9) {
            System.out.println("Summer");
        } else if (month >= 9 && month < 13) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number!");
        }
    }
}
