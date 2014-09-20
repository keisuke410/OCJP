/**

 * @brief DateFormatにsetLocalは提供されていない。ローカルはインスタン時に決定される。
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Program30 {
    public static void main(String args[]){

        Date d = new Date();
        DateFormat df = DateFormat.getInstance();
        //ローカル設定例
        DateFormat de = DateFormat.getDateInstance(DateFormat.LONG,Locale.FRANCE);
        //		df.setLocal(args[0]);
        System.out.println(df.format(d));

    }
}
