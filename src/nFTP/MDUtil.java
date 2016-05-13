package nFTP;

import java.io.File;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/*
 * 生成文件的数字摘要（MD5,SHA1,CRC）
 */
public class MDUtil {
	
	public static String getMD5(File file){
//		函数包
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			byte[] data = "hello".getBytes();
			byte[] result = md.digest(data);
			
//			System.out.println(result.length);
//			System.out.println(Arrays.toString(result));
			
//			字节数组转换为十六进制数
			BigInteger b = new BigInteger (1, result);
			System.out.println(b.toString());
			//整数转换成字符串：数制系统
			String m = b.toString(16);
			System.out.println();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		MDUtil.getMD5(null);
	}
}
