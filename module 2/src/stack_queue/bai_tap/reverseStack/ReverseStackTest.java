package stack_queue.bai_tap.reverseStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ReverseStackTest {
    public static void main(String[] args) {
        Stack<Integer> listInteger = new Stack<>();

        for (int i = 1; i <= 5; i++) {
            listInteger.add(i);
        }

        System.out.print("Trước khi đảo số: ");
        for (int array : listInteger) {
            System.out.print(array + " ");
        }
        System.out.print("\nSau khi đảo số: ");
        while (!listInteger.isEmpty()) {
            System.out.print(listInteger.pop() + " ");
        }

        Stack<String> stackString = new Stack<>();
        stackString.push("H");
        stackString.push("U");
        stackString.push("Y");

        System.out.print("\nTrước khi đảo số: ");
        for (String arrayString : stackString) {
            System.out.print(arrayString + " ");
        }
        System.out.print("\nSau khi đảo số: ");
        while (!stackString.isEmpty()) {
            System.out.print(stackString.pop() + " ");
        }
    }
}
