/**

 * @brief interruptedにて割り込みフラグをクリアすることを確認する。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program16 {
    public static void main(String args[]){
        Runnable a = new Runnable(){
            public void run(){
                for(int i = 0; i<10; i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.print("A");
                        Thread.interrupted();
                    }
                }
            }
        };
        Thread t = new Thread(a);
        t.start();
        t.interrupt();
    }
}
