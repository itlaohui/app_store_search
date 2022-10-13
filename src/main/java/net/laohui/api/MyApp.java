package net.laohui.api;

import com.dtflys.forest.annotation.GetRequest;

/**
 * @Author laohui
 * @Date 2022/10/12 15:46
 * @Desc
 * @Version 1.0
 */
public interface MyApp extends BaseApi {

    @GetRequest("https://www.baidu.com")
    String helloWorld();
}
