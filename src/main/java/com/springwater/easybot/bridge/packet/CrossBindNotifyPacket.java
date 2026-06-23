package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * 跨平台绑定通知包（服务端主动推送）
 * <p>
 * 当某玩家在社交平台触发跨平台绑定时，EasyBot 服务端会向所有在线服务器广播此包，
 * 通知玩家可使用 /easybot confirm &lt;code&gt; 完成确认。
 * </p>
 *
 * <p>包格式：</p>
 * <pre>
 * {
 *   "op": 4,
 *   "exec_op": "CROSS_BIND_NOTIFY",
 *   "callback_id": "&lt;UUID&gt;",
 *   "player_name": "&lt;MC玩家名&gt;",
 *   "code": "&lt;确认码&gt;",
 *   "target_platform": "&lt;要绑定的目标平台，如 telegram&gt;",
 *   "origin_platform": "&lt;已绑定的原平台，如 qq&gt;"
 * }
 * </pre>
 */
@Setter
@Getter
public class CrossBindNotifyPacket extends PacketWithCallBackId {
    /**
     * MC 玩家名
     */
    @SerializedName("player_name")
    private String playerName;

    /**
     * 跨平台绑定确认码
     */
    @SerializedName("code")
    private String code;

    /**
     * 要绑定的目标平台，如 "telegram"
     */
    @SerializedName("target_platform")
    private String targetPlatform;

    /**
     * 已绑定的原平台，如 "qq"
     */
    @SerializedName("origin_platform")
    private String originPlatform;
}
