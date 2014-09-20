/**

 * @brief 日付を表示する。
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.text.DateFormat;
import java.util.Date;

public class Program29 {
    public static void main(String args[]){
        Date d = new Date();
        DateFormat df = DateFormat.getInstance();
        System.out.println(df.format(d));

    }
}
