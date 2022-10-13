package net.laohui.api;

import java.util.List;
import java.util.Map;

/**
 * @Author laohui
 * @Date 2022/10/12 17:31
 * @Desc
 * @Version 1.0
 */
public interface BaseApi {
    List<Map<String, String>> getAppList();

    Map<String, String> getAppInfo();
}
