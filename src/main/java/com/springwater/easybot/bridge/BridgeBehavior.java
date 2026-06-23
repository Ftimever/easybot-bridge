package com.springwater.easybot.bridge;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.google.gson.JsonObject;
import com.springwater.easybot.bridge.message.Segment;
import com.springwater.easybot.bridge.model.PlayerInfo;
import com.springwater.easybot.bridge.model.PlayerSkin;
import com.springwater.easybot.bridge.model.ServerInfo;
import com.springwater.easybot.bridge.packet.NbtDataTypeEnum;

public interface BridgeBehavior {
    String runCommand(String playerName, String command, boolean enablePapi);

    String papiQuery(String playerName, String query);

    ServerInfo getInfo();

    void SyncToChat(String message);

    void BindSuccessBroadcast(String playerName, String accountId, String accountName);

    void KickPlayer(String player, String kickMessage);

    void SyncToChatExtra(List<Segment> segments, String text);

    boolean moduleIsInstalled(String moduleName);

    boolean moduleIsEnabled(String moduleName);

    boolean isAuthenticated(String playerName);

    @Nullable
    JsonObject ReadNbtData(String playerUuid, NbtDataTypeEnum dataType);

    List<PlayerInfo> getPlayerList();

    @Nullable
    PlayerSkin getPlayerSkin(String playerName);
    
    void onCrossBindNotify(String playerName, String code, String targetPlatform, String originPlatform);

}
