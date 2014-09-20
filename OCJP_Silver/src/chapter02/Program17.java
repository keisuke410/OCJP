package chapter02;
/**
 *
 * @brief finallyブロッグは例外の有無に問わず必ず行う
 *
 * @author kf-p
 *
 */

public class Program17 {
    public static void main(String[] args){

        try{
            hello();
        }catch (Exception e){
            System.out.print("A");
        }finally {
            System.out.print("B");
        }
        System.out.print("C");
    }

    private static void hello() throws Exception{
        try{
            throw new Exception();
        }finally{
            System.out.print("D");
        }
    }
}

