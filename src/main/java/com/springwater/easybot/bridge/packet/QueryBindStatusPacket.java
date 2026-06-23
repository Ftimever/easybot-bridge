package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询玩家绑定状态请求包
 * <p>
 * 客户端向 EasyBot 服务端发送此包，查询指定玩家的跨平台绑定状态。
 * </p>
 *
 * <p>请求格式：</p>
 * <pre>
 * {
 *   "op": 4,
 *   "exec_op": "QUERY_BIND_STATUS",
 *   "callback_id": "&lt;UUID&gt;",
 *   "player_name": "&lt;玩家名&gt;"
 * }
 * </pre>
 */
@Setter
@Getter
public class QueryBindStatusPacket extends PacketWithCallBackId {
    /**
     * 要查询的玩家游戏名
     */
    @SerializedName("player_name")
    private String playerName;

    /**
     * 构造查询绑定状态请求包，设置操作名为 QUERY_BIND_STATUS
     */
    public QueryBindStatusPacket() {
        setOperation("QUERY_BIND_STATUS");
    }
}
