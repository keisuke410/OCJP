/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter05;

public class Program02 {
    public static void main(String args[]){
        Sample s = new Sample();
        int data = 1;
        s.method(1);
    }
}
class Sample{
    public void method(long a){
        System.out.println("A");
    }
    public void method(short s){
        System.out.println("B");
    }
}
