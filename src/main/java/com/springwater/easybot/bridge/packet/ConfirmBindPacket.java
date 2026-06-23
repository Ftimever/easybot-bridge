package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * 确认跨平台绑定请求包
 * <p>
 * 当玩家在服务器输入 /easybot confirm <code> 时，客户端向 EasyBot 服务端发送此包，
 * 请求确认跨平台绑定操作。
 * </p>
 *
 * <p>请求格式：</p>
 * <pre>
 * {
 *   "op": 4,
 *   "exec_op": "CONFIRM_BIND",
 *   "callback_id": "&lt;UUID&gt;",
 *   "player_name": "&lt;玩家名&gt;",
 *   "code": "&lt;确认码&gt;"
 * }
 * </pre>
 */
@Setter
@Getter
public class ConfirmBindPacket extends PacketWithCallBackId {
    /**
     * 玩家游戏名
     */
    @SerializedName("player_name")
    private String playerName;

    /**
     * 跨平台绑定确认码
     */
    @SerializedName("code")
    private String code;

    /**
     * 构造确认绑定请求包，设置操作名为 CONFIRM_BIND
     */
    public ConfirmBindPacket() {
        setOperation("CONFIRM_BIND");
    }
}
