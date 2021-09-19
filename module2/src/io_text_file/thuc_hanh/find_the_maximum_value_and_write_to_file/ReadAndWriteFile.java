package io_text_file.thuc_hanh.find_the_maximum_value_and_write_to_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = reader.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            reader.close();
        }catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất: " + max);
            bufferedWriter.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
