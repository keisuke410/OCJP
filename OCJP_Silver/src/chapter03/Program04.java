/**

 * @brief   StringAPIの確認
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program04 {
    public static void main(String args[]){

        String str1 = "abc";
        String str2 = "123";
        String str3 = "a b c ";
        String str4 = "ABC";
        StringBuilder sb = 	new StringBuilder();

        //置換
        System.out.println(str1.replace("a", "e"));

        //文字列の追加（最後尾）
        System.out.println(sb.append(str1));

        //文字列の抽出
        System.out.println(str1.substring(2));

        //文字列の最後に連結
        System.out.println(str1.concat(str2));

        //文字列の小文字変換
        System.out.println(str4.toLowerCase());

        //最後空白を削除
        System.out.println(str3.trim());

        //大文字、小文字関係なく比較
        System.out.println(str1.equalsIgnoreCase(str4));

    }
}
