package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * 绑定状态中的社交账号信息
 * <p>
 * 表示玩家已绑定的一个社交平台账号，包含平台名称、昵称和平台唯一标识。
 * </p>
 *
 * <p>字段说明：</p>
 * <ul>
 *   <li>{@code platform} - 平台标识，如 "qq"、"telegram"</li>
 *   <li>{@code name} - 该平台上的昵称</li>
 *   <li>{@code uuid} - 该平台上的唯一标识</li>
 * </ul>
 */
@Setter
@Getter
public class BindStatusAccount {
    /**
     * 平台标识，如 "qq"、"telegram"
     */
    @SerializedName("platform")
    private String platform;

    /**
     * 该平台上的昵称
     */
    @SerializedName("name")
    private String name;

    /**
     * 该平台上的唯一标识
     */
    @SerializedName("uuid")
    private String uuid;
}
