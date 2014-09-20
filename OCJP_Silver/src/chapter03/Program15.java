/**

 * @brief integerとstringbuilderの比較結果 stringbuilderはラップする値を変更できる。
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program15 {
    public static void main(String args[]){

        Integer i1 = 400;
        Integer i2 = i1;
        i2++;
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = sb1;

        sb2.append("d");
        if(i1 == i2)
            System.out.println("x ");
        if(sb1 == sb2)
            System.out.println("y ");
    }
}
