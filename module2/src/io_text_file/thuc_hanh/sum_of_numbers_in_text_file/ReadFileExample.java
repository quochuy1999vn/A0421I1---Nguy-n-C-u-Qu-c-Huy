package io_text_file.thuc_hanh.sum_of_numbers_in_text_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //Đọc file theo đường dẫn
            File file = new File(filePath);

            //Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            reader.close();

            //Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        }catch (Exception e) {
            //TH file không tồn tại or nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
