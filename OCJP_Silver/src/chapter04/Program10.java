/**

 * @brief joinメソッドはオーバーロードされているため、100秒で指定した場合は2倍されない。
 *
 * @param なし
 * @return なし
 */

package chapter04;

public class Program10 extends Thread{

    public static int num = 0;
    {
        num = 4;
    }
    public Program10(){
        super(new Runnable(){
            public void run(){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num *= 2;
            }
        });
        start();
    }
    public static void main(String args[]){
        new Program10().calc();
    }
    private void calc() {
        try {
            join(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        num -= 1;
        System.out.println(num);
    }
}
