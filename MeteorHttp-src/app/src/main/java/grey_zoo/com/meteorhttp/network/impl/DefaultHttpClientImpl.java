package grey_zoo.com.meteorhttp.network.impl;

import org.apache.http.HttpRequest;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.message.BasicHttpRequest;

import grey_zoo.com.meteorhttp.network.BaseHttpClient;
import grey_zoo.com.meteorhttp.utils.Consts;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public class DefaultHttpClientImpl extends BaseHttpClient {

    private DefaultHttpClient mHttpClient;

    private HttpRequest request;

    DefaultHttpClientImpl(){
        mHttpClient=new DefaultHttpClient();
        
    }

    DefaultHttpClientImpl(String url,Consts.RequestType requestType){
        this();

    }

    @Override
    public void setUrl(String url) {

    }

    @Override
    public void setRequestType(Consts.RequestType requestType) {

    }

    @Override
    public void setHttpVersion(Consts.HttpVersion httpVersion) {

    }

    @Override
    public void setBody(String body) {

    }

    @Override
    public void setBody(byte[] body) {

    }

    @Override
    public void setParams(String key, String value) {

    }

    @Override
    public void setHeader(String key, String value) {

    }
}
