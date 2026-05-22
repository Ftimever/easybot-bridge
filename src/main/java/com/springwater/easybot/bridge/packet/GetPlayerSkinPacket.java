package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetPlayerSkinPacket extends PacketWithCallBackId {
    @SerializedName("player_name")
    private String playerName;

    public GetPlayerSkinPacket() {
        setOperation("GET_PLAYER_SKIN");
    }
}
