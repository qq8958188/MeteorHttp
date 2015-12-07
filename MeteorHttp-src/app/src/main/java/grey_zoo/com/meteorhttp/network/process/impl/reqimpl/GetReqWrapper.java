package grey_zoo.com.meteorhttp.network.process.impl.reqimpl;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

import grey_zoo.com.meteorhttp.network.process.impl.AbstractReqtWrapper;
import grey_zoo.com.meteorhttp.request.BaseRequest;

/**
 * Created by Administrator on 2015/11/24 0024.
 */
public class GetReqWrapper extends AbstractReqtWrapper {

    public GetReqWrapper(BaseRequest request) {
        super(request);
    }

    @Override
    protected void setBody(BaseRequest request) {

    }

    @Override
    protected void setParams(BaseRequest request) {

    }

    @Override
    protected HttpRequestBase getRequest(BaseRequest request) {
        return new HttpGet(request.getFullUri());
    }
}
