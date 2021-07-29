package top.b0x0.steamworksapi;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import top.b0x0.steamworksapi.common.MethodDto;
import top.b0x0.steamworksapi.common.SteamApiEnum;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ISteamWebAPIUtilTests {
    @Autowired
    RestTemplate restTemplate;

    private static final String steamId64 = "76561198332498227";
    private static final String steamWebApiKey = "7BC3C7D5EDBC6B95B350ECA322D909B7";


    /**
     * https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil
     * ISteamWebAPIUtil.GetServerInfo
     */
    @Test
    public void ISteamWebAPIUtil_GetServerInfo() {
        String url = "https://api.steampowered.com/ISteamWebAPIUtil/GetServerInfo/v1/";
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
        System.out.println("body = " + body);
        // {"servertime":1627528914,"servertimestring":"Wed Jul 28 20:21:54 2021"}
    }

    /**
     * ISteamWebAPIUtil.GetSupportedAPIList
     */
    @Test
    public void ISteamWebAPIUtil_GetSupportedAPIList() {
        // http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v1/?key=XXXXXX&steamids=123456
        String url = "http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v1/?key=%s";
        String finalUrl = String.format(url, steamWebApiKey);
        ResponseEntity<String> responseEntity = restTemplate.exchange(finalUrl, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
//        System.out.println("body = " + body);
        //
        // {
        //    "apilist": {
        //        "interfaces": []
        //    }
        //}
        JSONObject jsonObject = JSONObject.parseObject(body);

        JSONObject apilist = (JSONObject) jsonObject.get("apilist");
        JSONArray interfaces = (JSONArray) apilist.get("interfaces");
        List<MethodDto> ISteamUserMethodsList = new ArrayList<>();

        for (Object anInterface : interfaces) {
            JSONObject parseObject = JSONObject.parseObject(anInterface.toString());
            System.out.println("parseObject = " + parseObject);
            String name = (String) parseObject.get("name");
            if ("ISteamUser".equals(name)) {
                JSONArray methods = (JSONArray) parseObject.get("methods");
                for (Object method : methods) {
                    JSONObject methodParseObject = JSONObject.parseObject(method.toString());

                    String methodName = (String) methodParseObject.get("name");
                    Integer version = (Integer) methodParseObject.get("version");

                    MethodDto methodDto = new MethodDto()
                            .setInterfaceName("ISteamUser")
                            .setMethodName(methodName)
                            .setVersion(version.toString());
                    ISteamUserMethodsList.add(methodDto);
                }
            }
        }
        System.out.println("ISteamUserMethodsList = " + ISteamUserMethodsList);
    }



}
