/**

 * @brief StringBuilderで遊ぶ！
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program13 {
    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("abbcddeef");
        sb.insert(2, "xyz").delete(4, 9).replace(3,7,"cba");
        System.out.println(sb);
    }
}
