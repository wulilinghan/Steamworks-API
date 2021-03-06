# Steam Web API ä½¿ç¨
ð® Go library for accessing the [Steamworks Web API DOC](https://partner.steamgames.com/doc/webapi)

> è·åWEB_API_KEYï¼ https://steamcommunity.com/dev/apikey
> 
> æ¥è¯¢steamid64: https://steamid.facheme.com/

# â Steamworks Web API ç´¢å¼

- [ ]  æä¾å¯¹ Steam ç´æ­çè®¿é®ã[IBroadcastService Interface](https://partner.steamgames.com/doc/webapi/IBroadcastService)
- [ ]  æ­¤æå¡åè®¸æ¨çæ¸¸æå VAC ç³»ç»ä¸¾æ¥ä½å¼è¡ä¸ºåä½å¼èï¼å¹¶æä¾æ¸¸æå°ç¦ç³»ç»èåçå·¥å·éã[ICheatReportingService Interface](https://partner.steamgames.com/doc/webapi/ICheatReportingService)
- [ ]  ç¨æ¥è¿è¡è·¨å¹³å°å­æ¡£ç Steam äº APIã[ICloudService Interface](https://partner.steamgames.com/doc/webapi/icloudservice)
- [ ]  ä¾åä½ä¼ä¼´æéå¶å°è®¿é® Steam å¸åºã[IEconMarketService Interface](https://partner.steamgames.com/doc/webapi/IEconMarketService)
- [ ]  å¯¹ Steam äº¤ææä¾è®¿é®çå¶ä» Steam ç»æµä½æ¹æ³ã[IEconService Interface](https://partner.steamgames.com/doc/webapi/IEconService)
- [ ]  è¿æ¯ä¸ Steam ç»æµä½äº¤äºçä¸»æ¥å£ã[IGameInventory Interface](https://partner.steamgames.com/doc/webapi/IGameInventory)
- [ ]  è¿æ¯ç¨äºä¸æ¸¸æéç¥äº¤äºçæ¥å£ã[IGameNotificationsService Interface](https://partner.steamgames.com/doc/webapiIGameNotificationsService)
- [ ]  ä¼å Steam æ¸¸ææå¡å¨ç®¡ççæ¹æ³ã[IGameServersService Interface](https://partner.steamgames.com/doc/webapi/IGameServersService)
- [ ]  è¿æ¯ç¨äºè®¿é® Steam åºå­æå¡çæ¥å£ã[IInventoryService Interface](https://partner.steamgames.com/doc/webapi/IInventoryService)
- [ ]  è¿æ¯ç¨æ¥è®¿é® Steam å¤§åæå¡çæ¥å£ã[ILobbyMatchmakingService Interface](https://partner.steamgames.com/doc/webapi/ILobbyMatchmakingService)
- [ ]  æä¾ä¸ Steam ç¨æ·äº¤äºçå¶ä»æ¹æ³ã[IPlayerService Interface](https://partner.steamgames.com/doc/webapi/IPlayerService)
   - [x] è·åç©å®¶æè¿(2å¨)è¿è¡çæ¸¸æçä¿¡æ¯ã[GetRecentlyPlayedGames](https://partner.steamgames.com/doc/webapi/IPlayerService#GetRecentlyPlayedGames)
   - [x] è·åææäº§åçä½¿ç¨æ¶é´ã[ClientGetLastPlayedTimes](https://partner.steamgames.com/doc/webapi/IPlayerService#ClientGetLastPlayedTimes)
   - [x] è¿åç©å®¶æ¥æçæ¸¸æåè¡¨ã[GetOwnedGames](https://partner.steamgames.com/doc/webapi/IPlayerService#GetOwnedGames)
   - [x] è¿åç¨æ·ç Steam ç­çº§ã[GetSteamLevel](https://partner.steamgames.com/doc/webapi/IPlayerService#GetSteamLevel)
   - [x] è·å¾æå®ç¨æ·ææ¥æçå¾½ç« ã[GetBadges](https://partner.steamgames.com/doc/webapi/IPlayerService#GetBadges)
- [ ]  æä¾ä¸ Steam åæå·¥åç©åäº¤äºçå¶ä»æ¹æ³ã[IPublishedFileService Interface](https://partner.steamgames.com/doc/webapi/IPublishedFileService)
- [ ]  ç¨äºè®¿é® Steam ä¸çåºç¨ç¨åºçæ°æ®ã [ISteamApps Interface](https://partner.steamgames.com/doc/webapi/ISteamApps)
- [ ]  æä¾ Steam ç¤¾åºåè½çæéå¶çè®¿é®ã[ISteamCommunity Interface](https://partner.steamgames.com/doc/webapi/ISteamCommunity)
- [ ]  ä¸ Steam ç»æµä½äº¤äºçæ¬¡çº§æ¥å£ã[ISteamEconomy Interface](https://partner.steamgames.com/doc/webapi/ISteamEconomy)
- [ ]  è·åæ¸¸ææå¡å¨ç»è®¡æ°æ®å¹¶ä¸ä¹äº¤äºçæ¥å£ã[ISteamGameServerStats Interface](https://partner.steamgames.com/doc/webapi/ISteamGameServerStats)
- [ ]  ç¨äºè®¿é® Steam æè¡æ¦ã[ISteamLeaderboards Interface](https://partner.steamgames.com/doc/webapi/ISteamLeaderboards)
- [ ]  ä¸ºå¼åä¸æµè¯ç®çï¼ä½¿ç¨èææ°æ®åºæ´é² ISteamMicroTxn æ¥å£ã[ISteamMicroTxn Interface](https://partner.steamgames.com/doc/webapi/ISteamMicroTxn)
- [ ]  è¿æ¯ç¨äºæ¯æå°é¢äº¤æï¼æ¸¸æåè´­ï¼çæ¥å£ã[ISteamMicroTxnSandbox Interface](https://partner.steamgames.com/doc/webapi/ISteamMicroTxnSandbox)
- [ ]  æä¾å¯¹ Steam æ°é»åè½çè®¿é®ã[ISteamNews Interface](https://partner.steamgames.com/doc/webapi/ISteamNews)
- [ ]  è®©åä½ä¼ä¼´å¯¹å¶ Steam åæå·¥åçåå®¹è¿è¡å¨å±æç´¢ã[ISteamPublishedItemSearch Interface](https://partner.steamgames.com/doc/webapiISteamPublishedItemSearch)
- [ ]  è®©åä½ä¼ä¼´è®¿é®å¶ Steam åæå·¥åä¸­çåå®¹çæç¥¨ä¿¡æ¯ã[ISteamPublishedItemVoting Interface](https://partner.steamgames.com/doc/webapiISteamPublishedItemVoting)
- [ ]  ä¸ Steam åæå·¥ååç¨æ·çæåå®¹ï¼UGCï¼äº¤äºçä¸»æ¥å£ã[ISteamRemoteStorage Interface](https://partner.steamgames.com/doc/webapi/ISteamRemoteStorage)
- [ ]  Steam ç«ç¹è®¸å¯è®¡åï¼ç½å§ãVR æ¸¸æåãå¤§å­¦ç­å¤ç¨æ·ç«ç¹çåç¨è®¸å¯ï¼ã[ISiteLicenseService Interface](https://partner.steamgames.com/doc/webapi/isitelicenseservice)
- [ ]  ç¨äºè®¿é®å³äºç¨æ·çä¿¡æ¯ã[ISteamUserAuth Interface](https://partner.steamgames.com/doc/webapi/ISteamUserAuth)
- [ ]  ç¨äºè®¿é®å³äºç¨æ·çä¿¡æ¯ã[ISteamUser Interface](https://partner.steamgames.com/doc/webapi/ISteamUser)
   - [x] è¿åå¥½ååè¡¨ã[GetFriendList](https://partner.steamgames.com/doc/webapi/ISteamUser#GetFriendList)
- [ ]  ç¨äºè®¿é®ä¿¡æ¯å¹¶ä¸ç¨æ·äº¤äºã[ISteamUserStats Interface](https://partner.steamgames.com/doc/webapi/ISteamUserStats)
   - [x] è·å¾æå®æ¸¸æçç»è®¡ä¸æå°±çå®æ´åè¡¨ã [GetSchemaForGame](https://partner.steamgames.com/doc/webapi/ISteamUserStats#GetSchemaForGame)
- [ ]  éè¿å®ç¨å·¥å·æ¹æ³æä¾ä¸ Web API ç¸å³çåç§æé¡¹åè½ã[ISteamWebAPIUtil Interface](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil)
   - [x] è¿åç¨æ·ç Steam ç­çº§ã[GetServerInfo](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil#GetServerInfo)
   - [x] æ¥è¯¢è¯¥keyå¯ç¨çææAPIä¿¡æ¯ã[GetSupportedAPIList](https://partner.steamgames.com/doc/webapi/ISteamWebAPIUtil#GetSupportedAPIList)
- [ ]  é¢ååè¡åçå¶ä» Steam åæå·¥å æå¡æ¹æ³ã åè§ ISteamRemoteStorageï¼ä»¥ä¸ Steam åæå·¥åç©åç´æ¥äº¤äºã[IWorkshopService Interface](https://partner.steamgames.com/doc/webapi/IWorkshopService)

