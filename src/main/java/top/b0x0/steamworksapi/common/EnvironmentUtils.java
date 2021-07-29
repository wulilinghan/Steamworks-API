package top.b0x0.steamworksapi.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
@Component
public class EnvironmentUtils {
    @Autowired
    ApplicationContext applicationContext;

    public String getSteamId() {
        Environment env = applicationContext.getEnvironment();
        return env.getProperty("steam.id");
    }

    public String getSteamWebApiKey() {
        Environment env = applicationContext.getEnvironment();
        return env.getProperty("steam.web_api_key");
    }
}
