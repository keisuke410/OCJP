/**

 * @brief 正規表現の確認
 *        .  任意の文字
 *        \d 数値
 *        \D 数値以外
 *        \s 空白文字
 *        \S 空白文字以外
 *        \w 単語構成文字
 *        \W 単語構成文字以外
 *
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program16 {
    public static void main(String args[]){


        String str = "d8e9f10";
        String[] token = str.split("\\d");
        for(String s : token){
            System.out.print(s + " ");
        }
    }
}
