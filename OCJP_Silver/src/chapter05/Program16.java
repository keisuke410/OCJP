/**

 * @brief スーパークラス型からサブクラス型へキャストすることはダウンキャストをいいClassCastExceptionが発生する。
 *
 * @param なし
 * @return なし
 */

package chapter05;


class AA{
    public void hello(){
        System.out.println("A");
    }
}
class BB extends AA{
    public void hello(){
        System.out.println("B");
    }
}

public class Program16 {
    public static void main(String args[]){
        AA a = new AA();
        BB b = (BB)a;
        b.hello();
    }
}