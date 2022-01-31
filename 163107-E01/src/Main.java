import Z1.Z1;

import java.time.LocalTime;

public class Main {
    public static void Z1(String[] args) {
        Character[] listOfCharacters = {'a', 'b', 'c', 'c', 'b', 'a'};
        System.out.println(Z1.isPalindrom(listOfCharacters));
        LocalTime[] listOfLocal = {LocalTime.of(12, 30),
                LocalTime.of(12, 30),
                LocalTime.of(11, 30),
                LocalTime.of(12, 30),
                LocalTime.of(12, 30)};
        System.out.println(Z1.isPalindrom(listOfLocal));
    }
}
