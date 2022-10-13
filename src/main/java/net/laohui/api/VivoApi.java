package net.laohui.api;

import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.annotation.Query;
import com.dtflys.forest.annotation.Request;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author laohui
 * @Date 2022/10/12 17:42
 * @Desc
 * @Version 1.0
 */
public interface VivoApi extends BaseApi {

    @Request("https://h5-api.appstore.vivo.com.cn/h5appstore/search/sug-list?imei=1234567890&h5_websource=h5appstore")
    JSONObject searchApp(@Query("word") String search);
}
