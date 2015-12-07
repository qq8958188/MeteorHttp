package grey_zoo.com.meteorhttp.network.process.impl;

import grey_zoo.com.meteorhttp.network.process.impl.AbstractReqtWrapper;
import grey_zoo.com.meteorhttp.network.process.impl.reqimpl.GetReqWrapper;
import grey_zoo.com.meteorhttp.request.BaseRequest;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public class RequestFactory {

    public AbstractReqtWrapper getProcess(BaseRequest request){

        AbstractReqtWrapper reqtWrapper=null;
        switch (request.getRequestType()){
            case GET:
                reqtWrapper = new GetReqWrapper(request);
                break;

            case POST:
//                requestBase = new HttpPost(request.getUrl());
                break;

        }
        return reqtWrapper;
    }

}
