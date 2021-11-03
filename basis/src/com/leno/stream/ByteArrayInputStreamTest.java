package com.leno.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author LHYTC
 * @Title:
 * @Package
 * @Description:
 * @date 2021-10-31 22:39
 */
public class ByteArrayInputStreamTest {
    public static void main(String[] args) {
        ByteArrayInputStream byteArrayInputStream = null;
        String str = "This is a test";
        byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        int charAt = 0;
        while((charAt = byteArrayInputStream.read()) != -1){
            //在缓冲区每隔4个打印
            byteArrayInputStream.skip(4);
            System.out.println((char)charAt);
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
