package Util;

import java.text.DecimalFormat;

/**
 * 结果处理类：计算重复率
 */
public class ResultUtil {
    public static String textCheck(String originStr, String compareStr){
        DecimalFormat format = new DecimalFormat("0.00");
        //计算初始文本的simHash
        String originSimHash = SimHashUtil.getSimHash(originStr);
        //计算对比文本的simHash
        String compareSimHash = SimHashUtil.getSimHash(compareStr);
        //计算并返回对比文本重复率，结果保留两位小数
        //查重结果有两种求法,结果有细微的偏差,本项目使用第二种求法：
        //1: 1-海明距离/simHash总长度
        //2: (simHash总长度-海明距离)/simHash总长度
        return format.format((128 - HammingUtil.getHammingDistance(originSimHash, compareSimHash))/128);
    }
}
