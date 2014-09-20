/**

 * @brief 割り込み(interrupt)は遷移でなく、お願いであり、実行順序はスケジュールが握っていることを確認する。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program15 {
    public static void main(String args[]){
        Runnable a = new Runnable(){
            public void run(){
                for(int i = 0; i<10; i++){
                    System.out.print("A");
                }
            }
        };
        Thread t = new Thread(a);
        t.start();
        t.interrupt();
        for(int i = 0; i<10; i++){
            System.out.print("B");
        }
    }
}
