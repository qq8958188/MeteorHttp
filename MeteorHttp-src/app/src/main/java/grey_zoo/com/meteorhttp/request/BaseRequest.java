package grey_zoo.com.meteorhttp.request;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import grey_zoo.com.meteorhttp.utils.Consts;

/**
 * Created by Administrator on 2015/11/13 0013.
 */
public class BaseRequest {

    public BaseRequest(String url, Consts.RequestType requestType) {
        this.url = url;
        this.requestType = requestType;
        headers=new HashMap<String,String>();
        paramMap=new HashMap<String,String>();
    }

    /**
     * 请求的url
     */
    private String url;

    /**
     * 请求类型参数
     */
    private Consts.RequestType requestType;

    /**
     * header信息
     */
    private Map<String,String> headers;

    /**
     * 参数列表
     */
    private Map<String,String> paramMap;

    /**
     * 添加头信息
     * @param key
     * @param val
     */
    public BaseRequest addHeader(String key,String val){
        headers.put(key,val);
        return this;
    }

    public BaseRequest addParam(String key,String value){
        paramMap.put(key,value);
        return this;
    }

    public Map<String,String> getParamMap(){
        return paramMap;
    }

    public Map<String,String> getHeader(){
        return headers;
    }

    /**
     * Body字段
     */
    private BaseReqBody body;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Consts.RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(Consts.RequestType requestType) {
        this.requestType = requestType;
    }


    public BaseReqBody getBody() {
        return body;
    }

    public void setBody(BaseReqBody body) {
        this.body = body;
    }

    public URI getFullUri(){
        StringBuilder fullUrl=new StringBuilder(url);
        if(paramMap.size()>0){
            fullUrl.append("?");
            for(Map.Entry<String,String> entry:paramMap.entrySet()){
                fullUrl.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
            }
            fullUrl = new StringBuilder(fullUrl.subSequence(0,fullUrl.length()-1));
        }
        return URI.create(fullUrl.toString());
    }
}
