package stack_queue.bai_tap.checkPalindrome_useQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindromeUseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("huy");

        for (String i : queue) {
            i.charAt(0);
        }
    }
}
