package grey_zoo.com.meteorhttp.network.process.impl.rspimpl;

import org.apache.http.Header;
import org.apache.http.HttpResponse;

import java.io.IOException;
import java.io.InputStream;

import grey_zoo.com.meteorhttp.network.process.impl.AbstractRspProcess;
import grey_zoo.com.meteorhttp.response.BaseResponse;

/**
 * Created by Administrator on 2015/11/24 0024.
 */
public class SuccessRspProcess extends AbstractRspProcess {

    public SuccessRspProcess(HttpResponse httpResponse, BaseResponse baseResponse) {
        super(httpResponse, baseResponse);
    }

    @Override
    public boolean run() throws IOException {
        return parseResult();
    }

    /**
     * 解析成功的结果
     * @throws IOException
     */
    protected boolean parseResult() throws IOException {
        InputStream is = httpResponse.getEntity().getContent();
        //解析内容
        baseResponse.statusCode=httpResponse.getStatusLine().getStatusCode();
        for(Header header:httpResponse.getAllHeaders()){
            baseResponse.headers.put(header.getName(),header.getValue());
        }
        baseResponse.rspBody.parseEntity(is);
        return true;
    }
}
