package searchAlgorithm.bai_tap.find_the_longest_ascending_sequence;

import java.util.LinkedList;
import java.util.Scanner;

public class FindTheLongestAscendingSequence {
    public static void main(String[] args) {
        String strings;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter String: ");
        strings = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        // Tìm chuỗi tăng dần có độ dài lớn nhất
        for (int i = 0; i < strings.length(); i++) {

            //Khai báo một linked list trung gian các kí tự của chuỗi tăng dần
            LinkedList<Character> list = new LinkedList<>();
            //thêm kí tự thứ i vào trong list
            list.add(strings.charAt(i));
            // vòng lặp bên trong
            for (int j = i + 1; j < strings.length(); j++) {
                //Kiểm tra ký tự tiếp theo có lớn hơn kí tự cuối cùng trong list hay không
                if (strings.charAt(j) > list.getLast()) {
                    //Nếu có thì thêm vào trong list
                    list.add(strings.charAt(j));
                }
            }
            //So sánh cỡ chữ của list trung gian và list chứa chuỗi tăng dần có kích thước lớn nhất
            if (list.size() > max.size()) {
                //Nếu kích cỡ của list trung gian lớn hơn kích cỡ của list có độ dài lớn nhất thì gán lại max
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        // Hiển thị chuỗi tăng dần dài nhất
        for (Character ch : max) {
            System.out.println(ch);
        }
        System.out.println();
    }
}
