/**

 * @brief yieldの挙動(促すのみで必ずではないことを覚える)
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program11 implements Runnable {

    @Override
    public void run() {
        Thread.yield();
        System.out.println("run");

    }

    public static void main(String args[]){
        Thread thread = new Thread(new Program11());
        thread.start();
        System.out.println("start");
    }


}
