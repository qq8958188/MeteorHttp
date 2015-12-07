package grey_zoo.com.meteorhttp.network.process.impl;

import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

import grey_zoo.com.meteorhttp.network.process.AbstractProcess;
import grey_zoo.com.meteorhttp.request.BaseRequest;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public class HttpClientProcess extends AbstractProcess{

    private static final String TAG = "HttpClientProcess";

    protected DefaultHttpClient httpClient;

    protected AbstractReqtWrapper reqtWrapper;

    private RequestFactory requestFactory =new RequestFactory();

    private ResponseFactory responseFactory = new ResponseFactory();

    public HttpClientProcess(BaseRequest request, BaseResponse response) {
        super(request, response);
        httpClient=new DefaultHttpClient();
        reqtWrapper = requestFactory.getProcess(request);
    }

    @Override
    public boolean run() {

        try {
            Log.i(TAG, "HTTP请求: " + reqtWrapper.requestBase.toString());
            HttpResponse response=httpClient.execute(reqtWrapper.requestBase);
            Log.i(TAG, "HTTP响应: " + response.toString());

            AbstractRspProcess rspProcess = responseFactory.getRspProcess(response,this.response);
            return rspProcess.run();

        } catch (Exception e) {
            return false;
        }
    }

}
