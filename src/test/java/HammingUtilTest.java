import Util.FileUtil;
import Util.HammingUtil;
import Util.SimHashUtil;
import org.junit.Test;

import java.io.File;

public class HammingUtilTest {
    @Test
    public void getHammingDistanceTest() {
        File f1=new File("D:/test/orig.txt");
        File f2=new File("D:/test/orig.txt");
        String str0 = FileUtil.readTxt(f1);
        String str1 = FileUtil.readTxt(f2);
        double distance = HammingUtil.getHammingDistance(SimHashUtil.getSimHash(str0), SimHashUtil.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

}
