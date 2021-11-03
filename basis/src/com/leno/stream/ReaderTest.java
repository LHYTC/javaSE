package com.leno.stream;

import java.io.FileReader;
import java.io.Reader;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 15:56
 */
public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = null;
        try{
            reader = new FileReader("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\com\\leno\\a.txt");
            char[] chars = new char[1024];
            int length = 0;
            while((length = reader.read(chars)) != -1){
                System.out.println(new String(chars,0,length));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
