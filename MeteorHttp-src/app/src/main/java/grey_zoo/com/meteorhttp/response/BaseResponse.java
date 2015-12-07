package grey_zoo.com.meteorhttp.response;

import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;

import grey_zoo.com.meteorhttp.utils.Consts;

/**
 * Created by Administrator on 2015/11/14 0014.
 */
public class BaseResponse {

    public BaseResponse(BaseRspBody baseRspBody){
        rspBody=baseRspBody;
        headers=new Hashtable<String,String>();
    }

    /**
     * 版本号信息
     */
    public Consts.HttpVersion httpVersion;

    /**
     * Http状态码
     */
    public int statusCode;

    /**
     * 响应头信息
     */
    public Map<String,String> headers;

    /**
     * 获取结果
     */
    public BaseRspBody rspBody;

}
