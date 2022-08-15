package rikkei.academy;

import java.util.List;

public class FindMaxValue {
    public static void main(String[] args) {
        ReadAndWriteFile f = new ReadAndWriteFile();
        System.out.println("Find Max Value");
        String NUMBERS_PATH = "numbers.txt";
        String RESULT_PATH = "result.txt";

        int max = findMaxValue(f.readFile(NUMBERS_PATH));
        f.writeFile(RESULT_PATH, max);
    }

    public static int findMaxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}