/**

 * @brief 文字列を日時にフォーマットする例
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Program31 {
    public static void main(String args[]){

        Date d = new Date(0L);

        //ローカル設定例
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
        //エラーになる。
        String s = "April 1. 2013";
        //		String s = "2012/02/02";
        try {
            d = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);

    }
}
