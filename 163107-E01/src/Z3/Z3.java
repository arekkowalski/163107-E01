package Z3;

import java.io.File;
import java.util.Arrays;


public class Z3 {
    public static void main(String[] args){
        sortedData("src");
    }

    private static void sortedData(String dir) {

        File[] files = new File(dir).listFiles();

        Arrays.sort(files, (a,b) -> {
            if (a.isDirectory() && !b.isDirectory()){
                return 1;
            }
            if (!a.isDirectory() && b.isDirectory()) {
                return -1;
            }
            return a.compareTo(b);
        });

        Arrays.stream(files).forEach(System.out::println);
    }
}
