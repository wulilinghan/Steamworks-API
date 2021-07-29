package top.b0x0.steamworksapi.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.b0x0.steamworksapi.common.MethodDto;
import top.b0x0.steamworksapi.common.R;
import top.b0x0.steamworksapi.common.SteamApiEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@RestController
@RequestMapping("ISteamWebAPIUtil")
@Api(tags = "ISteamWebAPIUtil")
public class ISteamWebAPIUtilController {
    @Autowired
    RestTemplate restTemplate;

    /**
     * https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil
     * ISteamWebAPIUtil.GetServerInfo
     */
    @GetMapping("GetServerInfo")
    @ApiOperation("GetServerInfo")
    public R ISteamWebAPIUtil_GetServerInfo_v1() {
        String url = SteamApiEnum.buildUrl(SteamApiEnum.ISteamWebAPIUtil_GetServerInfo_v1);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
        if (responseEntity.getStatusCode().is2xxSuccessful()) {

            System.out.println("body = " + body);
            // {"servertime":1627528914,"servertimestring":"Wed Jul 28 20:21:54 2021"}
            return R.ok(body);
        }
        return R.fail(body);
    }

    /**
     * ISteamWebAPIUtil.GetSupportedAPIList
     */
    @GetMapping("GetSupportedAPIList")
    @ApiOperation("查询该key可用的所有API信息。包括interface、method、version和描述等。")
    public R ISteamWebAPIUtil_GetSupportedAPIList_v1() {
        String url = SteamApiEnum.buildUrl(SteamApiEnum.ISteamWebAPIUtil_GetSupportedAPIList_v1);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String body = responseEntity.getBody();
        if (responseEntity.getStatusCode().is2xxSuccessful()) {

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
            return R.ok(body);
        }
        return R.fail(body);
    }


}
