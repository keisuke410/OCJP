/**

 * @brief 例外がスローされる検証は宣言された型情報に頼られる
 *
 * @param なし
 * @return なし
 */

package chapter05;

class A25 {
    public void hello() throws Exception{
        throw new Exception();
    }
}

class B25 extends A25{
    public void hello(){
        System.out.println("B");
    }
}

public class Program25 {
    public static void main(String args[]){
        A25 b = new B25();
//例外がスローされる検証は宣言された型情報に頼られる
//        b.hello();
    }
}
