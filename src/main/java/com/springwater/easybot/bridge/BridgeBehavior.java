package com.springwater.easybot.bridge;

import com.google.gson.JsonObject;
import com.springwater.easybot.bridge.message.Segment;
import com.springwater.easybot.bridge.model.PlayerInfo;
import com.springwater.easybot.bridge.model.ServerInfo;
import com.springwater.easybot.bridge.packet.NbtDataTypeEnum;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface BridgeBehavior {
    String runCommand(String playerName, String command, boolean enablePapi);
    String papiQuery(String playerName, String query);
    ServerInfo getInfo();
    void SyncToChat(String message);
    void BindSuccessBroadcast(String playerName,String accountId, String accountName);
    void KickPlayer(String player, String kickMessage);
    void SyncToChatExtra(List<Segment> segments, String text);
    boolean moduleIsInstalled(String moduleName);
    boolean moduleIsEnabled(String moduleName);
    boolean isAuthenticated(String playerName);
    @Nullable JsonObject ReadNbtData(String playerUuid, NbtDataTypeEnum dataType);
    List<PlayerInfo> getPlayerList();
}
