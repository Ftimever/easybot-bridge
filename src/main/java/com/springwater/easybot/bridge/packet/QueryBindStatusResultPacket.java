package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询玩家绑定状态结果包
 * <p>
 * EasyBot 服务端处理完 QUERY_BIND_STATUS 请求后返回的回调响应包，
 * 包含玩家是否已绑定以及已绑定的社交账号列表。
 * </p>
 *
 * <p>响应格式：</p>
 * <pre>
 * {
 *   "op": 5,
 *   "callback_id": "&lt;同上&gt;",
 *   "is_bound": true,
 *   "social_accounts": [
 *     { "platform": "qq", "name": "昵称", "uuid": "164907681" },
 *     { "platform": "telegram", "name": "TG昵称", "uuid": "123456" }
 *   ]
 * }
 * </pre>
 */
@Setter
@Getter
public class QueryBindStatusResultPacket extends PacketWithCallBackId {
    /**
     * 玩家是否已绑定社交平台账号
     */
    @SerializedName("is_bound")
    private boolean isBound;

    /**
     * 已绑定的社交账号列表
     */
    @SerializedName("social_accounts")
    private List<BindStatusAccount> socialAccounts = new ArrayList<>();
}
