package grey_zoo.com.meteorhttp.network;

import grey_zoo.com.meteorhttp.utils.Consts;

/**
 * Created by Administrator on 2015/11/15 0015.
 */
public abstract class BaseHttpClient {

    public abstract void setUrl(String url);

    public abstract void setRequestType(Consts.RequestType requestType);

    public abstract void setHttpVersion(Consts.HttpVersion httpVersion);

    public abstract void setBody(String body);

    public abstract void setBody(byte[] body);

    public abstract void setParams(String key,String value);

    public abstract void setHeader(String key,String value);

}
