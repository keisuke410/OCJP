/**

 * @brief wait,notify,notifyAllといったメソッドはsynchronized指定されたメソッド・ブロック内でのみ使用できる。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program14 {
    public static void main(String args[]){
        Runnable task = new Runnable(){
            public void run(){
                //synchronizedを入れないとエラーになる。
                synchronized(this){
                    try {
                        wait();
                        System.out.println("おｋ2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(task).start();
        new Program14().sync();
    }

    private void sync()  {
        synchronized(this){
            notifyAll();
            System.out.println("end");
        }
    }
}
