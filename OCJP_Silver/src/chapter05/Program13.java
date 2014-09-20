/**

 * @brief オーバーライドの特性を理解
 *
 * @param なし
 * @return なし
 */

package chapter05;


class A{
    public void hello(){
        System.out.println("hello");
    }
}
class B extends A{
    public void hello(){
        System.out.println("hi");
    }
}
public class Program13 {
    public static void main(String args[]){
        B b = new B();
        A a = b;
        a.hello();
    }
}