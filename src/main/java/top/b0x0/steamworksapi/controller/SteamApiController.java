package top.b0x0.steamworksapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.b0x0.steamworksapi.common.R;

/**
 *
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@RestController
public class SteamApiController {

    private static final String URL_BASE = "http://api.steampowered.com";

    @Autowired
    RestTemplate restTemplate;

    @Value("${steam.id}")
    private String steamId64;
    @Value("${steam.web_api_key}")
    private String steamWebApiKey;

    @GetMapping("list")
    public R getSupportedAPIList() {
        // http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v1/?key=XXXXXX&steamids=123456
        String url = "http://api.steampowered.com/ISteamWebAPIUtil/GetSupportedAPIList/v1/?key=%s&steamids=%s";
        String finalUrl = String.format(url, steamWebApiKey, steamId64);
        ResponseEntity<String> responseEntity = restTemplate.exchange(finalUrl, HttpMethod.GET, null, String.class);
        return R.ok(responseEntity.getBody());
    }
}
