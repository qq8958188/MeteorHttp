package grey_zoo.com.meteorhttp;

import grey_zoo.com.meteorhttp.cache.BaseCache;
import grey_zoo.com.meteorhttp.config.MeteorHttpConfig;
import grey_zoo.com.meteorhttp.dispatcher.ReqDispatcher;
import grey_zoo.com.meteorhttp.request.BaseRequest;
import grey_zoo.com.meteorhttp.request.handler.HttpHandler;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/13 0013.
 * public Api
 */
public class MeteorHttp {

    /**
     * 进行全局的配置信息
     */
    public static final MeteorHttpConfig config=new MeteorHttpConfig();

    /**
     * 发送异步Http请求
     */
    public static <T> HttpHandler sendAsyncHttpRequest(BaseRequest request){
        return null;
    }

    /**
     * 发送同步Http请求
     */
    public static boolean sendSyncHttpRequest(BaseRequest request,BaseResponse response){
        return ReqDispatcher.getInstance().sendSyncRequest(request,response);
    }

}
