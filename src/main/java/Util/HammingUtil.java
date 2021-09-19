package Util;

/**
 * 根据哈希值计算海明距离
 */

public class HammingUtil {
    /**
     * 获取两字符串的海明距离
     * @param simHash1 字符串1
     * @param simHash2 字符串2
     * @return 海明距离
     */
    public static double getHammingDistance(String simHash1, String simHash2){
        //只要有一个simHash为空，海明距离都为128
        if(simHash1 == null | simHash2 == null){
            return 128;
        }
        double hammingDistance = 0;
        //计算海明距离
        for(int i = 0; i<simHash1.length() ; i++){
            hammingDistance += simHash1.charAt(i) ^ simHash2.charAt(i);
        }
        return hammingDistance;
    }

}

