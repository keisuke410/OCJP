package chapter02;

/**
 *
 * @brief try-catch内のメソッドにスローキーワードがない場合、キャッチすることができないためエラーとなる。
 *
 * @author kf-p
 *
 */

public class Program11{
    public static void main(String[] args){
        try{
            hello();
        }catch(MyException e){

        }
    }

    //throwsがないとコンパイルエラーとなる。
//  private static void hello(){
    private static void hello() throws MyException{
        System.out.println("hello");
    }

}
