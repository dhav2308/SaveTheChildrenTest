package com.saveTheChildren.UsersInformation.util;

import org.springframework.stereotype.Component;

/**
 * This class contains utility methods for encryption and decryption of users'
 * data.
 * 
 * @author Dhavalkumar Dadhania
 *
 */
@Component
public class UserUtil {
	byte[] inputDataCharArray;

	/**
	 * This is a method to encrypt the user data .
	 * 
	 * @param inputData in string form
	 * @return an encrypted string
	 * @throws Exception
	 */
	public String encryptUserData(String inputData) throws Exception {
		inputDataCharArray = inputData.getBytes();
		for (int i = 0; i < inputDataCharArray.length; i++) {
			inputDataCharArray[i] += 10;
		}
		String encryptedString = new String(inputDataCharArray);
		return encryptedString;

	}

	/**
	 * This is a method to decrypt the user data .
	 * 
	 * @param inputData in string form
	 * @return a decrypted string
	 */
	public String decryptUserData(String inputData) throws Exception {
		inputDataCharArray = inputData.getBytes();
		for (int i = 0; i < inputDataCharArray.length; i++) {
			inputDataCharArray[i] -= 10;
		}
		String decryptedString = new String(inputDataCharArray);
		return decryptedString;

	}
}
