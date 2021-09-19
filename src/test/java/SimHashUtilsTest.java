import Util.FileUtil;
import Util.SimHashUtil;
import org.junit.Test;

import java.io.File;

public class SimHashUtilsTest {

    @Test
    public void getHashTest(){
        String[] strings = {"今天", "的", "月亮", "超级", "好看"};
        for (String string : strings) {
            String stringHash = SimHashUtil.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        File f1=new File("D:test/orig.txt");
        File f2=new File("D:/test/orig_0.8_add.txt");
        String result1 = FileUtil.readTxt(f1);
        String result2= FileUtil.readTxt(f2);
        System.out.println(SimHashUtil.getSimHash(result1));
        System.out.println(SimHashUtil.getSimHash(result2));
    }
}
