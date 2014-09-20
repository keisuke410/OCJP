/**

 * @brief startメソッドが実行されるまでは、新しいスレッドは生成されない。また一回しか起動出来ない。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program06 {
    public static void main(String args[]){
        Runnable task = new Runnable(){
            public void run(){
                System.out.println("おｋ2");
            }
        };
        Thread thread = new Thread(task);
        thread.run();
        thread.run();
        thread.start();
//        thread.start();
    }
}
