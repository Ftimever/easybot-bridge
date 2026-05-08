package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReadNbtPacket extends PacketWithCallBackId{
    @SerializedName("player_uuid")
    private String uuid;
    @SerializedName("data_type")
    private NbtDataTypeEnum dataType;
    public ReadNbtPacket(){
        setOperation("READ_NBT_DATA");
    }
}
