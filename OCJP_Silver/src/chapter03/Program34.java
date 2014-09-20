/**

 * @brief >6789.12<と表示させてみたい(%[引数インデックス][フラグ][全体幅][.精度]変換用文字)
 *
 * @param なし
 * @return なし
 */

package chapter03;


public class Program34 {
    public static void main(String args[]){

        double d = 6789.123;
        System.out.printf(">%7.2f<",d);

    }
}
