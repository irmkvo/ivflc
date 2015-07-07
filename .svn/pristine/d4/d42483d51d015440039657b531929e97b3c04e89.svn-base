package core;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author programmer
 */
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

import sun.misc.*;

public class Security {
     private static final String ALGO = "AES";
     private static final byte[] keyValue =
    		 new byte[] { 'O', 'u', 'r', 'S', 'e', 'c', 'r',
         'e', 't', ',', 'T','h', 'e', 'K', 'e', 'y' };
     public static String encrypt(String Data) throws Exception {
         Key key = generateKey();
         Cipher c = Cipher.getInstance(ALGO);
         c.init(Cipher.ENCRYPT_MODE, key);
         byte[] encVal = c.doFinal(Data.getBytes());
         String encryptedValue = new BASE64Encoder().encode(encVal);
         return encryptedValue;
     }

     public static String decrypt(String encryptedData) throws Exception {
         Key key = generateKey();
         Cipher c = Cipher.getInstance(ALGO);
         c.init(Cipher.DECRYPT_MODE, key);
         byte[] decordedValue = new
BASE64Decoder().decodeBuffer(encryptedData);
         byte[] decValue = c.doFinal(decordedValue);
         String decryptedValue = new String(decValue);
         return decryptedValue;
     }
     private static Key generateKey() throws Exception {
         Key key = new SecretKeySpec(keyValue, ALGO);
         return key;
     }
     public static String getPublicId(Integer id){
         if (id == null){
             return null;
         }
         try {
             return Base64.encodeBase64URLSafeString((encrypt(id.toString())).getBytes());
         } catch (Exception e) {
             return id.toString();
         }
     }

     public static Integer getPrivateId(String key){
         if (key == null){
             return null;
         }
         try {
             return
Integer.parseInt(decrypt(new String(Base64.decodeBase64(key.trim()))));
         } catch (Exception e) {
             System.out.println("ERROR SECURITY "+e.getMessage());
             return null;
         }
     }
}