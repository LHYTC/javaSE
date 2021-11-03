package com.leno.stream;

import java.io.*;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 21:31
 */
public class CopyImgByReaderAndWriter {
    public static void main(String[] args) {
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\11.jpg");
            writer = new FileWriter("2.jpg");
            char[] chars = new char[1024];
            int length = 0;
            while((length = reader.read(chars)) != -1){
                writer.write(chars,0, length);
            }
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
