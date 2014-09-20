/**

 * @brief hasNextXXX:存在確認 nextXXX:次のトークンに進む
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.util.Locale;
import java.util.Scanner;

public class Program26{

    private Scanner s;
    public Program26(Scanner s){
        this.s = s;
    }

    public void filter(String d){
        s.useDelimiter(":");
        while(s.hasNext()){
            if(s.hasNextBoolean()){
                System.out.print(s.nextBoolean());
            }else{
                s.next();
            }
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner("X:true:B:false:F:false");
        new Program26(s).filter(":");


        Locale lc = new Locale("fr");
    }

}
