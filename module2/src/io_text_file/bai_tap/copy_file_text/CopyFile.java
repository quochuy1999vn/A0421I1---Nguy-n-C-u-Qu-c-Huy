package io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static void copyFile(File source, File dest) throws Exception {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);

            byte[] buf = new byte[1024];
            int byteRead;
            while ((byteRead = inputStream.read(buf)) > 0) {
                outputStream.write(buf,0, byteRead);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }

    public static void main(String[] args) throws Exception {
        File source = new File("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_text_file\\bai_tap\\copy_file_text\\source.txt");
        File dest = new File("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_text_file\\bai_tap\\copy_file_text\\dest.txt");

        copyFile(source, dest);
    }
}
