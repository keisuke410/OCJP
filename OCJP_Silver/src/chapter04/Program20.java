/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter04;

class Sample{
    private int num = 0;
    public synchronized void setNum(int num){
        this.num = num;
        notifyAll();
    }
    public synchronized int getNum(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this.num;
    }
}
class A implements Runnable{

    private Sample sample;
    public A(Sample sample){
        this.sample = sample;
    }
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            sample.setNum(i);
        }
    }
}
class B implements Runnable{

    private Sample sample;
    public B(Sample sample){
        this.sample = sample;
    }
    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(sample.getNum());
        }
    }
}
public class Program20{
    public static void main(String[] args){
        Sample sample = new Sample();
        new Thread(new A(sample)).start();
        new Thread(new B(sample)).start();
    }
}