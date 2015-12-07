package grey_zoo.com.meteorhttp.network.process.impl;

import org.apache.http.HttpResponse;

import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/24 0024.
 */
public abstract class AbstractRspProcess {

    protected HttpResponse httpResponse;

    protected BaseResponse baseResponse;

    public AbstractRspProcess(HttpResponse httpResponse, BaseResponse baseResponse) {
        this.httpResponse = httpResponse;
        this.baseResponse = baseResponse;
    }

    public abstract boolean run() throws Exception;

}
