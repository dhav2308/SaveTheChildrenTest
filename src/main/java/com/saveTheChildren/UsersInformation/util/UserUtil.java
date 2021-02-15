package com.saveTheChildren.UsersInformation.util;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

import org.springframework.stereotype.Component;

/**
 * This class contains utility methods for encryption and decryption of users' data.
 * 
 * @author Dhavalkumar Dadhania
 *
 */
@Component
public class UserUtil {
	private static final String algorithmUsed = "AES";

	/**
	 * This is a method to encrypt the user data .
	 * 
	 * @param inputData in string form
	 * @return an encrypted string
	 * @throws Exception
	 */
	public String encryptUserData(String inputData) throws Exception {
		String secretKey = "dk83ohgxczmwqeis";
		byte[] inputDataByteArray = secretKey.getBytes();
		Key key = new SecretKeySpec(inputDataByteArray, algorithmUsed);
		Cipher cipher = Cipher.getInstance(algorithmUsed);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedByteArray = cipher.doFinal(inputData.getBytes());
		String encryptedString = Base64.getEncoder().encodeToString(encryptedByteArray);
		return encryptedString;
	}

	/**
	 * This is a method to decrypt the user data .
	 * 
	 * @param inputData in string form
	 * @return a decrypted string
	 */
	public String decryptUserData(String inputData) throws Exception {
		String secretKey = "dk83ohgxczmwqeis";
		byte[] inputDataByteArray = secretKey.getBytes();
		Key key = new SecretKeySpec(inputDataByteArray, algorithmUsed);
		Cipher cipher = Cipher.getInstance(algorithmUsed);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] decodedInputData = Base64.getDecoder().decode(inputData.getBytes());
		byte[] decryptedByteArray = cipher.doFinal(decodedInputData);
		String decryptedString = new String(decryptedByteArray);
		return decryptedString;
	}
}
