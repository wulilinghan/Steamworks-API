package top.b0x0.steamworksapi.common;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Steam api enum
 *
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
public enum SteamApiEnum {

    /**
     * ISteamWebAPIUtil
     */
    ISteamWebAPIUtil_GetSupportedAPIList_v1(InterfaceConstants.ISteamWebAPIUtil, MethodConstants.ISteamWebAPIUtil_GetSupportedAPIList, "v1", HttpMethod.GET),
    ISteamWebAPIUtil_GetServerInfo_v1(InterfaceConstants.ISteamWebAPIUtil, MethodConstants.ISteamWebAPIUtil_GetServerInfo, "v1", HttpMethod.GET),

    /**
     * ISteamUser
     */
    ISteamUser_GetFriendList_v1(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_GetFriendList, "v1", HttpMethod.GET),
    ISteamUser_GetPlayerBans_v1(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_GetPlayerBans, "v1", HttpMethod.GET),
    ISteamUser_GetPlayerSummaries_V1(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_GetPlayerSummaries, "v1", HttpMethod.GET),
    ISteamUser_GetPlayerSummaries_V2(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_GetPlayerSummaries, "v2", HttpMethod.GET),
    ISteamUser_GetUserGroupList_v1(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_GetUserGroupList, "v1", HttpMethod.GET),
    ISteamUser_ResolveVanityURL_v1(InterfaceConstants.ISteamUser, MethodConstants.ISteamUser_ResolveVanityURL, "v1", HttpMethod.GET),

    /**
     * IPlayerService
     */
    IPlayerService_GetOwnedGames_V1(InterfaceConstants.IPlayerService, MethodConstants.IPlayerService_GetOwnedGames, "v1", HttpMethod.GET),
    IPlayerService_GetRecentlyPlayedGames_V1(InterfaceConstants.IPlayerService, MethodConstants.IPlayerService_GetRecentlyPlayedGames, "v1", HttpMethod.GET),
    IPlayerService_ClientGetLastPlayedTimes_V1(InterfaceConstants.IPlayerService, MethodConstants.IPlayerService_ClientGetLastPlayedTimes, "v1", HttpMethod.GET),
    IPlayerService_GetSteamLevel_V1(InterfaceConstants.IPlayerService, MethodConstants.IPlayerService_GetSteamLevel, "v1", HttpMethod.GET),
    IPlayerService_GetBadges_V1(InterfaceConstants.IPlayerService, MethodConstants.IPlayerService_GetBadges, "v1", HttpMethod.GET),

    /**
     * ISteamUserStats
     */
    ISteamUserStats_GetPlayerAchievements_V1(InterfaceConstants.ISteamUserStats, MethodConstants.ISteamUserStats_GetPlayerAchievements, "v1", HttpMethod.GET),
    ISteamUserStats_GetSchemaForGame_V2(InterfaceConstants.ISteamUserStats, MethodConstants.ISteamUserStats_GetSchemaForGame, "v2", HttpMethod.GET);

    private String interfaceName;
    private String methodName;
    private String version;
    private HttpMethod httpMethod;

    SteamApiEnum() {
    }

    SteamApiEnum(String interfaceName, String methodName, String version, HttpMethod httpMethod) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.version = version;
        this.httpMethod = httpMethod;
    }

    public static String buildUrl(SteamApiEnum apiEnum) {
        return String.format("http://api.steampowered.com/%s/%s/%s/?key=%s&steamid=%s",
                apiEnum.interfaceName, apiEnum.methodName, apiEnum.version, "{your steam web api key}", "76561198332498227");
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getVersion() {
        return version;
    }

    public HttpMethod getHttpMethod() {
        return httpMethod;
    }
}
