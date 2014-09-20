/**

 * @brief 親クラスで定義した変数を子クラスで定義し、子クラスをインスタンス化した際に親クラスで受け取っても変数の値は
 *        子クラスの値となる。
 *
 * @param なし
 * @return なし
 */

package chapter05;

class A21{
    public int num = 2;
    public int getNum(){
        return num;
    }
}

class B21 extends A21{
    public int num = 3;
    public int getNum(){
        return  num;
    }
}

public class Program21 {
    public static void main(String args[]){
        A21 a = new B21();
        B21 b = new B21();
        int result = a.num + b.num + a.getNum() + b.getNum();
        System.out.println(result);
    }
}
