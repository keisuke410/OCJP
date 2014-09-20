/**

 * @brief スレッドが干渉しないことを確認する。
 *
 * @param なし
 * @return なし
 */

package chapter04;

class Printer{
    public synchronized void printA(){
        for(int i = 0; i<5; i++){
            System.out.print("A");
        }
    }
    public void printB(){
        for(int i=0; i<5; i++){
            System.out.print("B");
        }
    }
}

abstract class Print implements Runnable{
    protected Printer printer;
    public Print(Printer printer){
        this.printer = printer;
    }
}

class AA extends Print{
    public AA(Printer printer){
        super(printer);
    }
    public void run(){
        super.printer.printA();
    }
}

class BB extends Print{
    public BB(Printer printer){
        super(printer);
    }
    public void run(){
        super.printer.printB();
    }
}

public class Program23{
    public static void main(String[] args)throws Exception{
        Printer printer = new Printer();
        Thread a = new Thread(new AA(printer));
        Thread b = new Thread(new BB(printer));
        a.start();
        b.start();
    }
}