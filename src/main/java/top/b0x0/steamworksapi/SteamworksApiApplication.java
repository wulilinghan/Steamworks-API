package top.b0x0.steamworksapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * http://localhost:7777/doc.html
 * steam信息查询
 * <p>
 * * Steam Web API的统一形式如下：
 * * http(s)://api.steampowered.com/$interface/$method/v$version/?appid={appid}&key={steamWebApiKey}&steamid={steam64id}&format={format}
 * * <p>
 * * format:
 * * 获取的数据形式有3种可选：
 * * json：缺省值。获取JSON格式数据。
 * * xml：获取XML格式数据。
 * * vdf：获取Valve的数据格式。这个是阀门公司自己的文件格式，具体介绍见官方文档。
 * * <p>
 * * steam web api文档地址：
 * * 1. https://steamapi.xpaw.me/
 * * 2. https://partner.steamgames.com/doc/webapi
 *
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@SpringBootApplication
public class SteamworksApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SteamworksApiApplication.class, args);
    }

}
