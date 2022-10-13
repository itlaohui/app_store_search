package net.laohui.demo;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.Forest;
import com.dtflys.forest.config.ForestConfiguration;
import net.laohui.api.MyApp;
import net.laohui.api.VivoApi;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author laohui
 * @Date 2022/10/12 15:45
 * @Desc
 * @Version 1.0
 */
public class main {
    static {
        // 获取 Forest 全局配置对象
        ForestConfiguration configuration = Forest.config();
        // 连接池最大连接数
        configuration.setMaxConnections(1000);
        // 连接超时时间，单位为毫秒
        configuration.setConnectTimeout(2000);
        // 数据读取超时时间，单位为毫秒
        configuration.setReadTimeout(2000);
    }

    public static void main(String[] args) {
        VivoApi client = Forest.client(VivoApi.class);
        JSONObject s = client.searchApp("qq");
        JSONObject data = (JSONObject) s.get("data");
        JSONObject appSearchSugResponse = (JSONObject) data.get("appSearchSugResponse");
        JSONArray apps = appSearchSugResponse.getJSONArray("apps");
        System.out.println(apps);
    }
}
