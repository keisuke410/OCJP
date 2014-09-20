/**

 * @brief
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Program20 {
    public static void main(String args[]){

        BufferedReader reader;
        PrintWriter writer;

        try {
            reader = new BufferedReader(new FileReader("in.txt"));
            writer = new PrintWriter(new BufferedWriter( new FileWriter("out.txt")));
            String line = null;
            while((line = reader.readLine()) != null){
                writer.write(line);
                writer.println();
            }
            writer.close();
            reader.close();
        }
        catch (FileNotFoundException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}