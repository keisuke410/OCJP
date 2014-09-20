/**

 * @brief カレンダークラスもnew Calendarとはできない。
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.util.Calendar;

public class Program32 {
    public static void main(String args[]){

        //インスタンス化の仕方が特殊
        Calendar cal = Calendar.getInstance();
        //	cal.add(Calendar.MONTH, 1);
        //年を変えない。
        cal.roll(Calendar.MONTH, 13);
        System.out.println(cal.getTime());
    }
}
