/**
 * @brief ArrayListとLinkedListの追加性能
 *
 * @param なし
 * @return なし
 */

package chapter06;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program09 {
    public static void main(String args[]){

        ArrayList<Integer> c = new ArrayList<Integer>();
        LinkedList<Integer> v = new LinkedList<Integer>();
        for(int i = 0; i < 100000; i++){
            c.add(0, new Integer(i));
        }
    }
}
