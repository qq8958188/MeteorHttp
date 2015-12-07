package grey_zoo.com.meteorhttp.response;

import java.io.InputStream;

/**
 * Created by Administrator on 2015/11/20 0020.
 */
public abstract class BaseRspBody<T> {

    public T result;

    /**
     * 解析实体的消息
     * @param in
     */
    public abstract void parseEntity(InputStream in);

}
