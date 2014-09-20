/**

 * @brief regexクラスで遊ぶ　正規表現エンジン
 *
 * @param なし
 * @return なし
 */


package chapter03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program17 {
    public static void main(String args[]){
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("ab5c2de9");
        while(m.find()){
            System.out.println(m.start() + "-" + m.group());
        }
    }
}
