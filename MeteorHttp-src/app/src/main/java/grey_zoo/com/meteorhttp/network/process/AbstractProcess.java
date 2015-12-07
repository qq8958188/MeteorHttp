package grey_zoo.com.meteorhttp.network.process;

import grey_zoo.com.meteorhttp.request.BaseRequest;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public abstract class AbstractProcess {

    protected BaseRequest request;

    protected BaseResponse response;

    public AbstractProcess(BaseRequest request, BaseResponse response) {
        this.request = request;
        this.response = response;
    }

    public abstract boolean run();


}
