package Z1;

public class Z1 {
    public static <T extends Comparable<T>> boolean isPalindrom(T[] lista) {
        for (int i = 0; i < lista.length / 2; i++) {
            if (lista[i].compareTo(lista[lista.length - 1 - i]) != 0)
                return false;
        }
        return true;
    }
}