/**

 * @brief スレッドの操作（スレッドはプラットフォームに依存している）
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program04 {
    public static void main(String args[]){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("run");
            }
        };
        Thread thread = new Thread(task){
            public synchronized void start(){
                System.out.println("start");
            }
        };
        thread.start();
    }
}
