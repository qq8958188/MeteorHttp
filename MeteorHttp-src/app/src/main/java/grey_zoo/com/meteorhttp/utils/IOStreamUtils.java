package grey_zoo.com.meteorhttp.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2015/11/20 0020.
 */
public class IOStreamUtils {

    /**
     * IO流转成字符串
     * @param inputStream
     * @param charset
     * @return
     */
    public static String getString(InputStream inputStream,String charset) throws IOException {

        if(charset == null)
            charset="UTF-8";

        BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream,charset));
        //最好在将字节流转换为字符流的时候 进行转码
        StringBuffer buffer=new StringBuffer();
        String line="";
        while((line=bf.readLine())!=null){
            buffer.append(line);
        }

        bf.close();

        return buffer.toString();

    }

}
