/**

 * @brief createNewfileには引数は渡せない、ディレクトリとファイルの作成する。
 *
 * @param なし
 * @return なし
 */

package chapter03;

import java.io.File;
import java.io.IOException;

public class Program19 {
    public static void main(String args[]) throws IOException{
        File dir = new File("test");
        dir.mkdir();
        File file = new File("sample.txt");
        //		file.createNewFile(dir,file);
        file.createNewFile();
        File newDir = new File("new");
        dir.renameTo(newDir);
    }
}
