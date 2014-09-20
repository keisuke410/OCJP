/**
 * @brief 整数型の基本データ型が優先される。（long > float > double）
 *
 * @param なし
 * @return なし
 */

package chapter05;

public class Program04 {
    public static void main(String args[]){
        Sample2 s = new Sample2();
        int data = 1;
        s.hoge(1);
    }
}
class Sample2{
    public void hoge(short a){
        System.out.println("A");
    }
    public void hoge(double s){
        System.out.println("D");
    }
    public void hoge(float s){
        System.out.println("B");
    }
    public void hoge(long s){
        System.out.println("C");
    }
}
