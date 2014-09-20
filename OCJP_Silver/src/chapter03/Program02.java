/**

 * @brief   "=="にて比較する場合、文字列の比較ではなくヒープ領域の比較としている。
 * 			同一の文字列の場合、コンスタントプールにて共有される。
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program02 {
    public static void main(String args[]){
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        if(str1 == str2)
            System.out.println("おｋ");
        if(str3 == str4)
            System.out.println("おｋ2");
    }
}
