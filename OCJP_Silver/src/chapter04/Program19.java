/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program19{
    private static boolean flg = false;
    private static int num = 0;
    private static class Sample extends Thread{
        public void run(){
            while(flg == false){
                num = num + 10;
                Thread.yield();
            }
            System.out.println(num);
        }
    }
    public static void main(String[] args){
        new Sample().start();
        num = num + 1;
        flg = true;
    }
}
