/**

 * @brief integerの初期化はnullとなるため、値を入れてあげないといけない。
 *
 * @param なし
 * @return なし
 */

package chapter03;

public class Program10 {
    static Integer i;
    static int x;
    static void foo(int y){
        x  = y+i;
        System.out.println(x);
    }
    public static void main(String[] args){
        foo(new Integer(1));
    }

}

