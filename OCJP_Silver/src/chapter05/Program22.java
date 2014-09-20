/**

 * @brief superキーワードは一階層上のクラスとなる。
 *
 * @param なし
 * @return なし
 */

package chapter05;

class AAAA{
    public void hello(){
        System.out.println("hello");
    }
}

abstract class BBBB extends AAAA{
    public abstract void hello();
}

class CCCC extends BBBB{
    public void hello(){
        //superキーワードは記述されたクラスの一階層上のスーパークラスが対象となるため、定義されないクラスは呼び出せない
//        super.hello();
    }
}
public class Program22 {
    public static void main(String args[]){

        System.out.println("おｋ2");
    }
}
