package top.b0x0.steamworksapi.common;

/**
 * 接口方法常量
 *
 * @author ManJiis
 * @since 2021-07-29
 * @since JDK1.8
 */
public class MethodConstants {

    /**
     * ISteamWebAPIUtil_GetSupportedAPIList
     * 查询该key可用的所有API信息。包括interface、method、version和描述等。
     */
    public static final String ISteamWebAPIUtil_GetSupportedAPIList = "GetSupportedAPIList";
    public static final String ISteamWebAPIUtil_GetServerInfo = "GetServerInfo";

    // ISteamUser ---------------------------------------------------------------------------------------------------

    /**
     * ISteamUser_GetFriendList
     * 获取好友列表
     */
    public static final String ISteamUser_GetFriendList = "GetFriendList";
    /**
     * ISteamUser_GetPlayerBans
     * 获取VAC封禁信息。
     */
    public static final String ISteamUser_GetPlayerBans = "GetPlayerBans";
    /**
     * ISteamUser_GetPlayerSummaries
     * 获取昵称、头像、在线状态等基础数据
     */
    public static final String ISteamUser_GetPlayerSummaries = "GetPlayerSummaries";
    /**
     * ISteamUser_GetUserGroupList
     * 获取加入的组列表。
     */
    public static final String ISteamUser_GetUserGroupList = "GetUserGroupList";
    public static final String ISteamUser_ResolveVanityURL = "ResolveVanityURL";

    // IPlayerService ---------------------------------------------------------------------------------------------------
    /**
     * IPlayerService_GetOwnedGames
     * 返回玩家拥有的游戏列表。* Steam曾经清理过一些低质量游戏，这些游戏不计入游戏总数，但在该接口中是计入并列出的。
     */
    public static final String IPlayerService_GetOwnedGames = "GetOwnedGames";
    /**
     * IPlayerService_GetRecentlyPlayedGames
     * 获取玩家最近运行的游戏的信息。包括产品名称、ID、图标、图片和游玩时间等内容。与Steam社区主页下方的最新动态一样。最后游玩的游戏会排在最前面。
     * <p>
     * https://partner.steamgames.com/doc/webapi/IPlayerService#GetRecentlyPlayedGames
     */
    public static final String IPlayerService_GetRecentlyPlayedGames = "GetRecentlyPlayedGames";
    /**
     * IPlayerService_ClientGetLastPlayedTimes
     * 获取所有产品的使用时间。包括总时间，最近使用的时间（两周），在windows、linux、mac等平台分别的使用时间。
     */
    public static final String IPlayerService_ClientGetLastPlayedTimes = "ClientGetLastPlayedTimes";
    /**
     * IPlayerService_GetSteamLevel
     * 获取社区等级
     */
    public static final String IPlayerService_GetSteamLevel = "GetSteamLevel";
    /**
     * IPlayerService_GetBadges
     * 获取所有获得的徽章的详细信息。
     */
    public static final String IPlayerService_GetBadges = "GetBadges";

    // ISteamUserStats ---------------------------------------------------------------------------------------------------

    /**
     * ISteamUserStats_GetPlayerAchievements
     * 获取指定游戏或软件的成就信息。必须指定产品ID才能获取信息。
     */
    public static final String ISteamUserStats_GetPlayerAchievements = "GetPlayerAchievements";
    /**
     * ISteamUserStats_GetSchemaForGame
     * 获得指定游戏的统计与成就的完整列表。
     */
    public static final String ISteamUserStats_GetSchemaForGame = "GetSchemaForGame";

}
