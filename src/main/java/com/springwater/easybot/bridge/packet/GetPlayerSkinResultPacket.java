package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetPlayerSkinResultPacket extends PacketWithCallBackId {
    @SerializedName("message")
    private String message;

    @SerializedName("result")
    private int result;

    @SerializedName("skin_url")
    private String skinUrl;

    @SerializedName("cape_url")
    private String capeUrl;
}
