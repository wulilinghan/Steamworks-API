package top.b0x0.steamworksapi.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.b0x0.steamworksapi.common.R;
import top.b0x0.steamworksapi.common.SteamApiEnum;


/**
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@RestController
@RequestMapping("ISteamUserStats")
@Api(tags = "ISteamUserStats")
public class ISteamUserStatsController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 获得指定游戏的统计与成就的完整列表。
     */
    @GetMapping("GetSchemaForGame")
    @ApiOperation("获得指定游戏的统计与成就的完整列表")
    public R ISteamUserStats_GetSchemaForGame_V2(@RequestParam("appid") String appid) {
        String url = SteamApiEnum.buildUrl(SteamApiEnum.ISteamUserStats_GetSchemaForGame_V2);
        url = url + "&appid=" + (StringUtils.hasText(appid) ? appid : 232090) + "l=";
        System.out.println("url = " + url);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
        if (responseEntity.getStatusCode().is2xxSuccessful()) {

            System.out.println("body = " + body);
            JSONObject jsonObject = JSONObject.parseObject(body);
            JSONObject game = (JSONObject) jsonObject.get("game");
            String gameName = (String) game.get("gameName");
            System.out.println("gameName = " + gameName);
            return R.ok(body);
        }
        return R.fail(body);
    }
}
