package grey_zoo.com.meteorhttp.request.impl;

import java.io.UnsupportedEncodingException;

import grey_zoo.com.meteorhttp.request.BaseReqBody;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public class StringReqBody extends BaseReqBody<String> {

    /**
     * 编码方式
     */
    public String encoding;

    public StringReqBody(String body) {
        super(body);
    }

    public StringReqBody(String body, String encoding) {
        super(body);
        this.encoding = encoding;
    }

    @Override
    public byte[] getBody() {

        if(null == body)
            return null;

        //转换编码
        if(null != encoding){
            try {
                body=new String(body.getBytes(),encoding);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("StringBody编码转换失败 body="+body
                        +",encoding="+encoding);
            }
        }

        //添加代码
        return body.getBytes();
    }
}
