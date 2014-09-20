/**

 * @brief transientとstaticは直列化されない。
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.io.Serializable;

public class Program24 implements Serializable{

    public static final String str = "hello";
    static int num = 1;
    Bar bar = null;
    //transient 一時的な
    transient int t = 0;
    protected long l = 0L;
    private char c =' ';

    class Bar implements Serializable{}

    public static void main(String args[]){
    }

}
