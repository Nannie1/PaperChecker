package Util;

import java.io.*;
import java.sql.SQLOutput;

/**
 * 实现文件的读写
 */
public class FileUtil {
    //将txt中的内容转化为String类型
    public static String readTxt(File file){
        StringBuilder result = new StringBuilder();
        try{
            // BufferedReader类读取文件
            BufferedReader read = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = read.readLine())!= null){
                result.append(System.lineSeparator() + s);
            }
            read.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }



    // 将结果输出到position所指定的位置,answer是计算出来的重复率（利用海明算法）
    public static void writeTxt(String answer, String position){
        try{
            System.out.println("重复率为:" + answer);
            FileWriter writer = new FileWriter(position, true);
            writer.write(answer+"\n");
            writer.flush();
            System.out.println("---------------------");
            System.out.println("查重结果路径为:" + position);
        }catch (Exception e){
            System.out.println("写入文件失败");
        }
    }
}
