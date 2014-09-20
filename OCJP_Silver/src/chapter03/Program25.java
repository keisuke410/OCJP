/**

 * @brief シリアライズの確認
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program25{

    public static void main(String args[]){
        Employee emp = new Employee(10,"Miles");

        try {
            FileOutputStream o1 = new FileOutputStream("emp.ser");
            ObjectOutputStream o2 = new ObjectOutputStream(o1);
            o2.writeObject(emp);
            o2.close();

            FileInputStream i1 = new FileInputStream("emp.ser");
            ObjectInputStream i2 = new ObjectInputStream(i1);
            emp = (Employee)i2.readObject();
            i2.close();
            System.out.println(emp.getPiyo());
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }


    }

}
