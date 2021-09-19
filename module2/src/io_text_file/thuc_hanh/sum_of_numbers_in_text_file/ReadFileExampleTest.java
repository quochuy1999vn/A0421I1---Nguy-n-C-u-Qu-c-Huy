package io_text_file.thuc_hanh.sum_of_numbers_in_text_file;

import java.util.Scanner;

public class ReadFileExampleTest {
    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
