package exercise;

import org.apache.poi.poifs.crypt.Decryptor;
import org.apache.poi.poifs.crypt.EncryptionInfo;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author tanglonglong
 * @version 1.0
 * @date 2019/6/25 11:28
 */
public class DecryptXlsx {
    public static void main(String[] args) {
     DecryptXlsx.decryptXlsx("C://Users/tanglonglong/Desktop/唐龙龙tanglonglong.xlsx");
    }
    /**
     *
     * 函数的目的/功能   解密 xls 或 xlsx 文件,返回解密成功的密码
     * @param url
     * @return
     */
    public static String decryptXlsx(String url) {
        Character[] pwdCharSet = {'0','1','2','3','4','5','6','7','8','9'};
        ArrayList<String> arr = new ArrayList<>();
        //6位密码
        for (int i = 0; i < pwdCharSet.length; i++) {
            for (int i1 = 0; i1 < pwdCharSet.length; i1++) {
                for (int i2 = 0; i2 < pwdCharSet.length; i2++) {
                    for (int i3 = 0; i3 < pwdCharSet.length; i3++) {
                        for (int i4 = 0; i4 < pwdCharSet.length; i4++) {
                            for (int i5 = 0; i5 < pwdCharSet.length; i5++) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append(pwdCharSet[i]).append(pwdCharSet[i1]).append(pwdCharSet[i2])
                                        .append(pwdCharSet[i3]).append(pwdCharSet[i4]).append(pwdCharSet[i5]);
                                arr.add(new String(stringBuffer));
                            }
                        }

                    }

                }
            }
        }



        File file = new File(url);
        InputStream is = null;
        String psd= "";
        try {
            is = new FileInputStream(file);
            POIFSFileSystem pfs = new POIFSFileSystem(is);
            EncryptionInfo ei = new EncryptionInfo(pfs);
            Decryptor decryptor = Decryptor.getInstance(ei);
            arr.forEach(pwd -> {
                try {
                    //word文件解密,返回解密结果
                    boolean flag = decryptor.verifyPassword(pwd);
                    if (flag) {
                        System.out.println("解密成功,密码为:"+pwd);
//                        psd = pwd;
                    }else{
                        //密码不匹配
//                        System.out.println("密码不匹配");
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());}
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return psd;
    }

}
