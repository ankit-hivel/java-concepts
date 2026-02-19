public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        return hours * 60;
    }

    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        return days * 24 * 60;
    }

    public static void main(String[] args) {
        System.out.printf("25 Hours to Minutes: %d\n", convertHoursToMinutes(25));
        System.out.printf("33 Days to Minutes: %d", convertDaysToMinutes(33));
    }
}