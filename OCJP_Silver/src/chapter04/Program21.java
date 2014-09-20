/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter04;

class SampleA{
    void print(){
        synchronized(this){
            String[] array = {"A","B","C","D","E"};
            for(String str : array){
                System.out.print(str);
            }
        Thread.yield();
        System.out.println();
        }
    }
}
class TaskA extends Thread{
    private SampleA sample;
    public TaskA(SampleA sample){
        this.sample = sample;
    }
    public void run(){
        this.sample.print();
    }
}
public class Program21{
    public static void main(String[] args){
        SampleA s = new SampleA();
        TaskA[] tasks = {new TaskA(s), new TaskA(s), new TaskA(s)};
        for(TaskA task : tasks){
            task.start();
        }

    }
}