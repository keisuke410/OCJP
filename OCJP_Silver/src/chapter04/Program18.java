/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program18 extends Thread {
        public synchronized void run(){
            try {
                Thread.sleep(1);
                System.out.println("not interrupt!");
            } catch (InterruptedException e) {
                System.out.println("interrupt!");
                e.printStackTrace();
            }

        }

    private synchronized void cancel() {
        interrupt();
    }

    public static void main(String args[]){
        Program18 t = new Program18();
        t.start();
        t.cancel();
    }

}
