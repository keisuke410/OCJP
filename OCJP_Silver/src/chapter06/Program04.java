/**
 * @brief ArrayListとLinkedListの追加性能
 *
 * @param なし
 * @return なし
 */

package chapter06;

import java.util.ArrayList;

public class Program04 {
    public static void main(String args[]){
        long start = System.currentTimeMillis();
        ArrayList<Integer> c = new ArrayList<Integer>();
//        LinkedList<Integer> c = new LinkedList<Integer>();
        for(int i = 0; i < 100000; i++){
            c.add(0, new Integer(i));
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }
}
