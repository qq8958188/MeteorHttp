package grey_zoo.com.meteorhttp.utils;

/**
 * Created by Administrator on 2015/11/15 0015.
 */
public interface Consts {

    //***************************请求相关常量**********************
    /**
     * HTTP类型
     */
    enum RequestType{
        GET,POST,PUT,HEAD,DELETE,OPTIONS,TRACE,CONNECT
    }

    /**
     * http的版本号
     */
    enum HttpVersion{
        HTTP_1_0,HTTP_1_1
    }

    /**
     * HTTP的常用状态码
     */
    interface StatusCode{

    }

}
