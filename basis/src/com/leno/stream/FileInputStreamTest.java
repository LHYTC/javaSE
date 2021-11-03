package com.leno.stream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 00:19
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream("E:\\workspace\\IntelliJIDEA\\leno\\msb\\javase\\basis\\src\\com\\leno\\a.txt");
/*            int charInt = 0;
            while((charInt = inputStream.read()) != -1){
                System.out.println((char)charInt);
            }*/
            //添加缓冲区的方式进行读取，每次会将数据添加到缓冲区，当缓冲区满了之后，进行一次读取
            int lenth = 0;
            byte[] buffer = new byte[1024];
            while ((lenth = inputStream.read(buffer)) != -1){
                System.out.println(new String(buffer,0,lenth));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                try{
                    inputStream.close();
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        }
    }
}
