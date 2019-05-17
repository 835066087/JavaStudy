package code;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.interfaces.RSAPublicKey;

import javax.crypto.Cipher;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

public class RSASimulator {

	public static final String CHARSET = "UTF-8";
	public static final String RSA_ALGORITHM = "RSA";

	public static void main(String[] args) {
		// 1.初始数p及q并获得n
		int p = 317;
		System.out.println("p = " + Integer.toBinaryString(p));
		int q = 509;
		System.out.println("q = " + Integer.toBinaryString(q));
		Integer n = p * q;
		System.out.println("n = " + n);

		// 2.获得欧拉函数
		Integer φ = 316 * 508;
		System.out.println("φ = " + φ);

		// 3.随机选取e，满足GCD=1
		int e = 9669;
		System.out.println("e = " + e);
		System.out.println("e与φ的最大公约数为：" + GCD(e, φ));

		// 4.扩展欧几里得算法
//		long[] exGCD = exGCD(e, φ);
//		for (long l : exGCD) {
//			System.out.println(l);
//		}
		int d = 52563;
		System.out.println("d = " + d);

		// 5.生成对应的二进制公钥私钥

		String N = Integer.toBinaryString(n);
		String E = Integer.toBinaryString(e);
		String D = Integer.toBinaryString(d);
		System.out.println("数字公钥为" + N);
		System.out.println("数字私钥为" + D);

		String publicKey = Base64.encodeBase64URLSafeString(N.getBytes());
		String privateKey = Base64.encodeBase64URLSafeString(D.getBytes());
		System.out.println("公钥为 = " + publicKey);
		System.out.println("私钥为 = " + privateKey);

		// 6.公钥加密
		String str = "我也不知道说什么";
		String str1 = Base64.encodeBase64URLSafeString(str.getBytes());
		System.out.println(str1);
	}

	public static int getGCD(int x, int y) {
		int max = 0;
		if (x > y) {
			int tmp = x;
			x = y;
			y = tmp;
		}
		for (int i = 1; i <= x; i++) {
			if (x % i == 0 && y % i == 0) {
				max = i;
			}
		}
		return max;
	}

	public static int GCD(int x, int y) {
		return y == 0 ? x : GCD(y, x % y);
	}

	public static long[] exGCD(long a, long b) {
		long ans;
		long[] result = new long[3];
		if (b == 0) {
			result[0] = a;
			result[1] = 1;
			result[2] = 0;
			return result;
		}

		long[] temp = exGCD(b, a % b);
		ans = temp[0];
		result[0] = ans;
		result[1] = temp[2];
		result[2] = temp[1] - (a / b) * temp[2];
		return result;
	}

	public static String publicEncrypt(String data, RSAPublicKey publicKey) {
		try {
			Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return Base64.encodeBase64URLSafeString(rsaSplitCodec(cipher, Cipher.ENCRYPT_MODE, data.getBytes(CHARSET),
					publicKey.getModulus().bitLength()));
		} catch (Exception e) {
			throw new RuntimeException("加密字符串[" + data + "]时遇到异常", e);
		}
	}

	@SuppressWarnings("deprecation")
	private static byte[] rsaSplitCodec(Cipher cipher, int opmode, byte[] datas, int keySize) {
		int maxBlock = 0;
		if (opmode == Cipher.DECRYPT_MODE) {
			maxBlock = keySize / 8;
		} else {
			maxBlock = keySize / 8 - 11;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int offSet = 0;
		byte[] buff;
		int i = 0;
		try {
			while (datas.length > offSet) {
				if (datas.length - offSet > maxBlock) {
					buff = cipher.doFinal(datas, offSet, maxBlock);
				} else {
					buff = cipher.doFinal(datas, offSet, datas.length - offSet);
				}
				out.write(buff, 0, buff.length);
				i++;
				offSet = i * maxBlock;
			}
		} catch (Exception e) {
			throw new RuntimeException("加解密阀值为[" + maxBlock + "]的数据时发生异常", e);
		}
		byte[] resultDatas = out.toByteArray();
		IOUtils.closeQuietly(out);
		return resultDatas;
	}

}
