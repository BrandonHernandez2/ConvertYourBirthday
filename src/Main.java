import java.time.*;

public class Main {

    public static void main(String[] args) {

        LocalDateTime fakeBirthday = LocalDateTime.of(2005, 9, 26, 3, 11, 0);
        System.out.println("My fake Birthday is on " + fakeBirthday);

        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(fakeBirthday, us);

        ZoneId london = ZoneId.of("Europe/Paris");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println("My fake Birthday in Paris is on " + birthdayParis);

    }

}
