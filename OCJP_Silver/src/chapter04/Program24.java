/**

 * @brief synchronizedをつけたstaticメソッドはプログラム全体で同時に１つのスレッドしか実行出来ない。
 *
 * @param なし
 * @return なし
 */

package chapter04;

class PrinterA{
    public synchronized static void printA(){
        for(int i = 0; i<5; i++){
            System.out.print("A");
        }
    }
    public synchronized static void printB(){
        for(int i=0; i<5; i++){
            System.out.print("B");
        }
    }
}

abstract class Printt implements Runnable{
    protected Printer printer;
    public Printt(Printer printer){
        this.printer = printer;
    }
}

class AAA extends Print{
    public AAA(Printer printer){
        super(printer);
    }
    public void run(){
        super.printer.printA();
    }
}

class BBB extends Print{
    public BBB(Printer printer){
        super(printer);
    }
    public void run(){
        super.printer.printB();
    }
}

public class Program24{
    public static void main(String[] args)throws Exception{
        Printer printer = new Printer();
        Thread a = new Thread(new AAA(printer));
        Thread b = new Thread(new BBB(printer));
        a.start();
        b.start();
    }
}