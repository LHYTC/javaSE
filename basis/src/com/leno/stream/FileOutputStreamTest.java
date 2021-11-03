package com.leno.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 14:47
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\com\\leno\\a.txt");
            outputStream = new FileOutputStream("ca.txt");
            byte[] cache = new byte[1024];
            int length;
            while((length = inputStream.read(cache)) != -1){
                outputStream.write(cache,0, length);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                try{
                    inputStream.close();
                }catch (Exception ein){
                    ein.printStackTrace();
                }
            }
            if(outputStream != null){
                try{
                    outputStream.close();
                }catch (Exception eou){
                    eou.printStackTrace();
                }
            }
        }
    }
}
