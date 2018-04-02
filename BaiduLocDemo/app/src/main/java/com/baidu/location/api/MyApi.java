package com.baidu.location.api;




import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @创建者 CSDN_LQR
 * @描述 server端api
 */

public interface MyApi {

   // public static final String BASE_URL = "http://api.sealtalk.im/";
    public static final String BASE_URL = "http://119.29.230.189/Navigation/";
    //检查手机是否被注册
   /* @POST("user/check_phone_available")
    Observable<CheckPhoneResponse> checkPhoneAvailable(@Body RequestBody body);*/

    //下载图片
    @GET
    Observable<ResponseBody> downloadPic(@Url String url);

    @POST("user/verify_code")
    Observable<String> SendInfo(@Body RequestBody body);

}
