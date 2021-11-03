package com.leno.stream;

import java.io.*;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 21:21
 */
public class WriterTest {
    public static void main(String[] args) {
        File file = new File("writer.txt");
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\com\\leno\\a.txt");
            writer = new FileWriter(file);
            char[] cache = new char[1024];
            int length = 0;
            while((length = reader.read(cache)) != -1){
                writer.write(cache);
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
