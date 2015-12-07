package grey_zoo.com.meteorhttp.network.process.impl.reqimpl;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

import grey_zoo.com.meteorhttp.network.process.impl.AbstractReqtWrapper;
import grey_zoo.com.meteorhttp.request.BaseRequest;

/**
 * Created by Administrator on 2015/12/6 0006.
 */
public class PostReqWrapper extends AbstractReqtWrapper {

    public PostReqWrapper(BaseRequest request) {
        super(request);
    }

    @Override
    protected void setBody(BaseRequest request) {

    }

    @Override
    protected void setParams(BaseRequest request) {
        HttpPost httpPost= (HttpPost) requestBase;

    }

    @Override
    protected HttpRequestBase getRequest(BaseRequest request) {
        return new HttpPost(request.getUrl());
    }
}
