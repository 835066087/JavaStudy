package code;

import java.util.Map;

public class RSATest {

	public static void main(String[] args) throws Exception {
		Map<String, String> keyMap = RSA.createKeys(512);
		String publicKey = keyMap.get("publicKey");
		String privateKey = keyMap.get("privateKey");
		System.out.println("公钥:" + publicKey);
		System.out.println("私钥:" + privateKey);
		
		System.out.println();
		String str = "水是万物的起源";
		
		System.out.println("\r明文：\r\n" + str);
		
		System.out.println("\r明文大小：\r\n" + str.getBytes().length);
		
		String encodedData = RSA.publicEncrypt(str, RSA.getPublicKey(publicKey));
		System.out.println();
		System.out.println("密文：\r\n" + encodedData);
		
		String decodedData = RSA.privateDecrypt(encodedData, RSA.getPrivateKey(privateKey));
		System.out.println();
		System.out.println("解密后文字: \r\n" + decodedData);

	}

}
