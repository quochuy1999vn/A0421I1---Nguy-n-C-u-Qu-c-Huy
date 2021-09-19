package io_text_file.thuc_hanh.find_the_maximum_value_and_write_to_file;

import java.util.List;

public class ReadAndWriteFileTest {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        List<Integer> numbers = readAndWriteFile.readFile("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_text_file\\thuc_hanh\\sum_of_numbers_in_text_file\\sum.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_text_file\\thuc_hanh\\find_the_maximum_value_and_write_to_file\\result.txt", maxValue);
    }
}
