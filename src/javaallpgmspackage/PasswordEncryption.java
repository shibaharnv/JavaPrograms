package javaallpgmspackage;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class PasswordEncryption {

	public static void main(String[] args) throws Exception {
		
		
		//Creating Instance for Cipher class.
		
		//AES - Advanced Encryption  algorithm
		
	//	Cipher cipherobj = Cipher.getInstance("AES");
		
		Cipher cipherobj2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
		// CBC is a mode where AES algorithm can work 
		// PKCS5Padding part is how AES algorithm should handle last bytes of the data to encrypt., if the data does not align with a 64 bit or 128 bit block size boundary.
		
		
		
		SecretKeySpec Key = getKey("automation".getBytes());
				
		cipherobj2.init(Cipher.ENCRYPT_MODE, Key);
		
	}
		
		
		private static SecretKeySpec getKey(byte[] arrBTmp) throws Exception {
			
			byte[] arrB = new byte[8];
			
			for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
				
				arrB[i] = arrBTmp[i];
			}
			SecretKeySpec key = new SecretKeySpec(arrB, "DES");
			return key;
		
		
		
		
	}


}
