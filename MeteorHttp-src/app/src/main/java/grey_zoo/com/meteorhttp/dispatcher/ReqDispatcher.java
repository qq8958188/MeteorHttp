package grey_zoo.com.meteorhttp.dispatcher;

/**
 * Created by Administrator on 2015/11/14 0014.
 */

import grey_zoo.com.meteorhttp.network.process.AbstractProcess;
import grey_zoo.com.meteorhttp.network.process.impl.RequestFactory;
import grey_zoo.com.meteorhttp.network.process.impl.HttpClientProcess;
import grey_zoo.com.meteorhttp.request.BaseRequest;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * 进行请求的分发
 */
public class ReqDispatcher {

    private static ReqDispatcher instance=new ReqDispatcher();

    private static RequestFactory factory=new RequestFactory();

    private ReqDispatcher(){

    }

    public static ReqDispatcher getInstance(){
        return instance;
    }

    /**
     * 同步方法
     * @param request 请求
     * @param response 结果
     * @return 是否成功，如果为true代表成功，false代表失败
     */
    public boolean sendSyncRequest(BaseRequest request,BaseResponse response){

        if(request == null || response == null)
            throw new RuntimeException("request or response is null");

        AbstractProcess process=new HttpClientProcess(request,response);

        process.run();

        if(response == null || response.statusCode != 200)
            return false;

        return true;
    }

}
