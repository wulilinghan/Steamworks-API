package top.b0x0.steamworksapi;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import top.b0x0.steamworksapi.common.SteamApiEnum;

/**
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@SpringBootTest
public class ISteamUserStatsTests {
    @Autowired
    RestTemplate restTemplate;

    private static final String steamId64 = "76561198332498227";
    private static final String steamWebApiKey = "{your steam web api key}";


    /**
     * 获得指定游戏的统计与成就的完整列表。
     */
    @Test
    public void ISteamUserStats_GetSchemaForGame_V2() {
        String url = SteamApiEnum.buildUrl(SteamApiEnum.ISteamUserStats_GetSchemaForGame_V2);
        url = url + "?" + "key=" + steamWebApiKey + "&appid=" + 232090 + "l=";
        System.out.println("url = " + url);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
//        System.out.println("body = " + body);
        JSONObject jsonObject = JSONObject.parseObject(body);
        JSONObject game = (JSONObject) jsonObject.get("game");
        String gameName = (String) game.get("gameName");
        System.out.println("gameName = " + gameName);
    }
}
