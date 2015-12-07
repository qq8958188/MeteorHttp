package grey_zoo.com.meteorhttp.request;

import grey_zoo.com.meteorhttp.network.BaseHttpClient;

/**
 * Created by Administrator on 2015/11/18 0018.
 */
public abstract class BaseReqBody<T> {

    public BaseReqBody(T body) {
        this.body = body;
    }

    public T body;

    public abstract byte[] getBody();

}
