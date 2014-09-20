package chapter02;
/**
 *
 * @brief 脳内でトレースできるかどうか。
 *
 * @author kf-p
 *
 */

public class Program04 {
    public static void main(String[] args){

        a:
            for(int i = 0; i < 5 ; i++){
                for(int j = 0; j < i ; j++){
                    if(j > 1){
                        continue a;
                    }
                    System.out.print("*");
                }
            }
    }
}
