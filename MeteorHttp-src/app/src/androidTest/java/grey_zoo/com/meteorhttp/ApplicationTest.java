package grey_zoo.com.meteorhttp;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;

import grey_zoo.com.meteorhttp.request.BaseRequest;
import grey_zoo.com.meteorhttp.response.BaseResponse;
import grey_zoo.com.meteorhttp.response.impl.StringRspBody;
import grey_zoo.com.meteorhttp.utils.Consts;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @LargeTest
    public void testHttpGet(){
        BaseRequest request=new BaseRequest("http://www.baidu.com", Consts.RequestType.GET);
        BaseResponse response=new BaseResponse(new StringRspBody());
        boolean isSuccess = MeteorHttp.sendSyncHttpRequest(request,response);
        if(isSuccess){
            Log.i("HTTP",response.rspBody.toString());
        }
    }

}