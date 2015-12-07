package grey_zoo.com.meteorhttp.network.process.impl;

import org.apache.http.client.methods.HttpRequestBase;

import java.util.Map;

import grey_zoo.com.meteorhttp.request.BaseRequest;

/**
 * Created by Administrator on 2015/11/20 0020.
 */
public abstract class AbstractReqtWrapper {

    public HttpRequestBase requestBase;

    public AbstractReqtWrapper(BaseRequest request){
        buildRequest(request);
    }

    public void buildRequest(BaseRequest request){
        
        requestBase = getRequest(request);
        setHeader(request);
        setParams(request);
        setBody(request);
        
    }

    protected abstract void setBody(BaseRequest request);

    protected abstract void setParams(BaseRequest request);

    protected abstract HttpRequestBase getRequest(BaseRequest request);

    protected void setHeader(BaseRequest request){
        if(request.getHeader().size() > 0) {
            for(Map.Entry<String,String> entry:request.getHeader().entrySet()) {
                requestBase.setHeader(entry.getKey(),entry.getValue());
            }
        }
    }

}
