/**

 * @brief インタフェースで定義する抽象メソッドは暗黙的にpublicとabstractキーワードによって修飾されるため、publicでなければならない
 *
 * @param なし
 * @return なし
 */

package chapter05;


interface AAA{
    void hello();
}

abstract class BBB implements AAA{
    //publicでなければだめ
    public void hello(){
        System.out.println("hello");
    }
}

class CCC extends BBB{
    public void hello(){
        System.out.println("bye");
    }
}

public class Program19 {
    public static void main(String args[]){
        AAA a = new CCC();
        a.hello();
    }
}