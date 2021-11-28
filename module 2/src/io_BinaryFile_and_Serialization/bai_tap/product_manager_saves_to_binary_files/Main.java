package io_BinaryFile_and_Serialization.bai_tap.product_manager_saves_to_binary_files;

import io_BinaryFile_and_Serialization.thuc_hanh.read_and_write_student_list_to_binary_file.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Products> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Products> readDataFromFile(String path){
        List<Products> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Products>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();
        products.add(new Products(1,"S20", "SamSung", "20tr", "Màn hình vô cực"));
        products.add(new Products(1,"Mi11 ultra", "Xiaomi", "20tr", "Màn hình ở mặt lưng"));
        products.add(new Products(1,"Ip12 pro", "Apple", "20tr", "Gọt được hoa quả"));

        writeToFile("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_BinaryFile_and_Serialization\\bai_tap\\product_manager_saves_to_binary_files\\products.txt", products);
        List<Products> studentDataFromFile = readDataFromFile("F:\\A0421I1 - Nguyen Cuu Quoc Huy\\module2\\src\\io_BinaryFile_and_Serialization\\bai_tap\\product_manager_saves_to_binary_files\\products.txt");
        for (Products products1 : studentDataFromFile){
            System.out.println(products1);
        }
    }
}
