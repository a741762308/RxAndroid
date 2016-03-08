package com.jxqix.dq.rxandroiddemo;

import com.jxqix.dq.rxandroiddemo.bean.IpInfo;
import com.jxqix.dq.rxandroiddemo.bean.User;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by dq on 2016/3/8.
 */
public interface ApiService {
    @GET("userLogin")
    Observable<User> login(@Query("acct") String acct, @Query("pwd") String pwd, @Query("hmac") String hmac);

    @GET("service/getIpInfo.php")
    Observable<IpInfo> getIpInfo(@Query("ip") String ip);
}
