package com.leno.stream;

import java.io.*;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 21:41
 */
public class CopyImgByInputStream {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\11.jpg");
            outputStream = new FileOutputStream("22.jpg");
            int charAct = 0;
            byte[] bytes = new byte[1024];
            while((charAct = inputStream.read(bytes))!= -1){
                outputStream.write(bytes);
            }
            outputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
