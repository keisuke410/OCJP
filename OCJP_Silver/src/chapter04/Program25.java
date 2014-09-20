/**

 * @brief volatileの特徴を理解
 *
 * @param なし
 * @return なし
 */

package chapter04;

class Samplee{
    private volatile String name = null;

    public String getName(){
        while(name == null){}
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

class Task implements Runnable{
    private Samplee sample;
    public Task(Samplee sample){
        this.sample = sample;
    }
    @Override
    public void run() {
        System.out.println(sample.getName());
    }

}

public class Program25 {
    public static void main(String args[]){
        Samplee sample = new Samplee();
        new Thread(new Task(sample)).start();
        sample.setName("hoge");
    }
}