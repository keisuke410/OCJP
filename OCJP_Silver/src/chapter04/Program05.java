/**

 * @brief スレッドIDの順序性
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program05 {
    public static void main(String args[]){
        Thread task = new Thread(){
            public void run(){
                System.out.println(Thread.currentThread().getId());
            }
            public void start(){
                System.out.println(Thread.currentThread().getId());
                super.start();
            }
        };
        task.start();
        System.out.println(Thread.currentThread().getId());
    }
}
