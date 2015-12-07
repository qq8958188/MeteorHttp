package grey_zoo.com.meteorhttp.network.process.impl;

import org.apache.http.HttpResponse;

import grey_zoo.com.meteorhttp.network.process.impl.AbstractRspProcess;
import grey_zoo.com.meteorhttp.network.process.impl.rspimpl.SuccessRspProcess;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/24 0024.
 */
public class ResponseFactory {

    public AbstractRspProcess getRspProcess(HttpResponse httpResponse,BaseResponse baseResponse){
        AbstractRspProcess rspProcess=null;
        switch (httpResponse.getStatusLine().getStatusCode()){
            case 200:
                rspProcess=new SuccessRspProcess(httpResponse,baseResponse);
                break;
        }
        return rspProcess;
    }

}
