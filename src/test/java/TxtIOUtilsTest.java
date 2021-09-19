import Util.FileUtil;
import org.junit.Test;

import java.io.File;

/**
 * 测试文件的读取
 */
public class TxtIOUtilsTest {

    @Test
    public void readFileTest() {
        File f=new File("D:/test/orig.txt");
        String str = FileUtil.readTxt(f);
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        File f=new File("D:/test/none.txt");
        String str = FileUtil.readTxt(f);
    }


}
