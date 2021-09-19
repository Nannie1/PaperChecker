package mian;

import Util.FileUtil;
import Util.ResultUtil;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        File f1=new File("D:test/orig.txt");
        File f2=new File("D:test/orig_0.8_add.txt");
        FileUtil.writeTxt(

                ResultUtil.textCheck(
                        FileUtil.readTxt(f1),FileUtil.readTxt(f2)),
                args[2]);



    }
}
