package chapter02;

/**
 *
 * @brief assertionerrorとなった場合、:以降の出力内容がスタックトレースに表示される。
 *
 * @author kf-p
 *
 */

public class Program22 {
    public static void main(String[] args){
        hello(null);
    }

    private static void hello(String name) {
        assert name == null: "name is not null";
        System.out.println("hello,"+ name);

    }
}
