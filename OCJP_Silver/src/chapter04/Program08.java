/**

 * @brief スレッドスリープはInterruptedExceptionを使用する。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program08 {
    public static void main(String args[]){
        Runnable task = new Runnable(){
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO 自動生成された catch ブロック
                    e.printStackTrace();
                }
                System.out.println("おｋ2");
            }
        };
        new Thread(task).start();
        System.out.println("おｋ2");
    }
}