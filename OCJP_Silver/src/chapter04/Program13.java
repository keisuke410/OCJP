/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program13{
    public static void main(String args[]){
        Runnable task = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    try {
                        wait(0);
                        System.out.println("start");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
//        new Thread(task).start();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("end");
    }


}
