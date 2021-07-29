# Steam Web API 使用
🎮 Go library for accessing the [Steamworks Web API DOC](https://partner.steamgames.com/doc/webapi)

> 获取WEB_API_KEY： https://steamcommunity.com/dev/apikey
> 
> 查询steamid64: https://steamid.facheme.com/

# ✔ Steamworks Web API 索引

- [ ]  提供对 Steam 直播的访问。[IBroadcastService Interface](https://partner.steamgames.com/doc/webapi/IBroadcastService)
- [ ]  此服务允许您的游戏向 VAC 系统举报作弊行为和作弊者，并提供游戏封禁系统背后的工具集。[ICheatReportingService Interface](https://partner.steamgames.com/doc/webapi/ICheatReportingService)
- [ ]  用来进行跨平台存档的 Steam 云 API。[ICloudService Interface](https://partner.steamgames.com/doc/webapi/icloudservice)
- [ ]  供合作伙伴有限制地访问 Steam 市场。[IEconMarketService Interface](https://partner.steamgames.com/doc/webapi/IEconMarketService)
- [ ]  对 Steam 交易提供访问的其他 Steam 经济体方法。[IEconService Interface](https://partner.steamgames.com/doc/webapi/IEconService)
- [ ]  这是与 Steam 经济体交互的主接口。[IGameInventory Interface](https://partner.steamgames.com/doc/webapi/IGameInventory)
- [ ]  这是用于与游戏通知交互的接口。[IGameNotificationsService Interface](https://partner.steamgames.com/doc/webapiIGameNotificationsService)
- [ ]  优化 Steam 游戏服务器管理的方法。[IGameServersService Interface](https://partner.steamgames.com/doc/webapi/IGameServersService)
- [ ]  这是用于访问 Steam 库存服务的接口。[IInventoryService Interface](https://partner.steamgames.com/doc/webapi/IInventoryService)
- [ ]  这是用来访问 Steam 大厅服务的接口。[ILobbyMatchmakingService Interface](https://partner.steamgames.com/doc/webapi/ILobbyMatchmakingService)
- [ ]  提供与 Steam 用户交互的其他方法。[IPlayerService Interface](https://partner.steamgames.com/doc/webapi/IPlayerService)
   - [x] 获取玩家最近(2周)运行的游戏的信息。[GetRecentlyPlayedGames](https://partner.steamgames.com/doc/webapi/IPlayerService#GetRecentlyPlayedGames)
   - [x] 获取所有产品的使用时间。[ClientGetLastPlayedTimes](https://partner.steamgames.com/doc/webapi/IPlayerService#ClientGetLastPlayedTimes)
   - [x] 返回玩家拥有的游戏列表。[GetOwnedGames](https://partner.steamgames.com/doc/webapi/IPlayerService#GetOwnedGames)
   - [x] 返回用户的 Steam 等级。[GetSteamLevel](https://partner.steamgames.com/doc/webapi/IPlayerService#GetSteamLevel)
   - [x] 获得指定用户所拥有的徽章。[GetBadges](https://partner.steamgames.com/doc/webapi/IPlayerService#GetBadges)
- [ ]  提供与 Steam 创意工坊物品交互的其他方法。[IPublishedFileService Interface](https://partner.steamgames.com/doc/webapi/IPublishedFileService)
- [ ]  用于访问 Steam 上的应用程序的数据。 [ISteamApps Interface](https://partner.steamgames.com/doc/webapi/ISteamApps)
- [ ]  提供 Steam 社区功能的有限制的访问。[ISteamCommunity Interface](https://partner.steamgames.com/doc/webapi/ISteamCommunity)
- [ ]  与 Steam 经济体交互的次级接口。[ISteamEconomy Interface](https://partner.steamgames.com/doc/webapi/ISteamEconomy)
- [ ]  获取游戏服务器统计数据并与之交互的接口。[ISteamGameServerStats Interface](https://partner.steamgames.com/doc/webapi/ISteamGameServerStats)
- [ ]  用于访问 Steam 排行榜。[ISteamLeaderboards Interface](https://partner.steamgames.com/doc/webapi/ISteamLeaderboards)
- [ ]  为开发与测试目的，使用虚拟数据库暴露 ISteamMicroTxn 接口。[ISteamMicroTxn Interface](https://partner.steamgames.com/doc/webapi/ISteamMicroTxn)
- [ ]  这是用于支持小额交易（游戏内购）的接口。[ISteamMicroTxnSandbox Interface](https://partner.steamgames.com/doc/webapi/ISteamMicroTxnSandbox)
- [ ]  提供对 Steam 新闻功能的访问。[ISteamNews Interface](https://partner.steamgames.com/doc/webapi/ISteamNews)
- [ ]  让合作伙伴对其 Steam 创意工坊的内容进行全局搜索。[ISteamPublishedItemSearch Interface](https://partner.steamgames.com/doc/webapiISteamPublishedItemSearch)
- [ ]  让合作伙伴访问其 Steam 创意工坊中的内容的投票信息。[ISteamPublishedItemVoting Interface](https://partner.steamgames.com/doc/webapiISteamPublishedItemVoting)
- [ ]  与 Steam 创意工坊和用户生成内容（UGC）交互的主接口。[ISteamRemoteStorage Interface](https://partner.steamgames.com/doc/webapi/ISteamRemoteStorage)
- [ ]  Steam 站点许可计划（网吧、VR 游戏厅、大学等多用户站点的商用许可）。[ISiteLicenseService Interface](https://partner.steamgames.com/doc/webapi/isitelicenseservice)
- [ ]  用于访问关于用户的信息。[ISteamUserAuth Interface](https://partner.steamgames.com/doc/webapi/ISteamUserAuth)
- [ ]  用于访问关于用户的信息。[ISteamUser Interface](https://partner.steamgames.com/doc/webapi/ISteamUser)
   - [x] 返回好友列表。[GetFriendList](https://partner.steamgames.com/doc/webapi/ISteamUser#GetFriendList)
- [ ]  用于访问信息并与用户交互。[ISteamUserStats Interface](https://partner.steamgames.com/doc/webapi/ISteamUserStats)
   - [x] 获得指定游戏的统计与成就的完整列表。 [GetSchemaForGame](https://partner.steamgames.com/doc/webapi/ISteamUserStats#GetSchemaForGame)
- [ ]  通过实用工具方法提供与 Web API 相关的各种杂项功能。[ISteamWebAPIUtil Interface](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil)
   - [x] 返回用户的 Steam 等级。[GetServerInfo](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil#GetServerInfo)
   - [x] 查询该key可用的所有API信息。[GetSupportedAPIList](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil#GetSupportedAPIList)
- [ ]  面向发行商的其他 Steam 创意工坊 服务方法。 参见 ISteamRemoteStorage，以与 Steam 创意工坊物品直接交互。[IWorkshopService Interface](https://partner.steamgames.com/doc/webapi/IWorkshopService)

