package grey_zoo.com.meteorhttp.response.impl;

import java.io.IOException;
import java.io.InputStream;

import grey_zoo.com.meteorhttp.response.BaseRspBody;
import grey_zoo.com.meteorhttp.utils.IOStreamUtils;

/**
 * Created by Administrator on 2015/11/20 0020.
 */
public class StringRspBody extends BaseRspBody<String> {

    public StringRspBody() {
    }

    public StringRspBody(String charSet) {
        this.charSet = charSet;
    }

    public String charSet;

    @Override
    public void parseEntity(InputStream in) {
        try {
            result= IOStreamUtils.getString(in,charSet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return result;
    }
}
