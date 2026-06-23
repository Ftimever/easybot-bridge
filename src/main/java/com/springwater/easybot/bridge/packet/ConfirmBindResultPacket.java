package com.springwater.easybot.bridge.packet;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

/**
 * 确认跨平台绑定结果包
 * <p>
 * EasyBot 服务端处理完 CONFIRM_BIND 请求后返回的回调响应包，
 * 包含操作是否成功、提示消息和已绑定的平台列表。
 * </p>
 *
 * <p>响应格式：</p>
 * <pre>
 * {
 *   "op": 5,
 *   "callback_id": "&lt;同上&gt;",
 *   "success": true,
 *   "message": "跨平台绑定成功！",
 *   "bound_platforms": "qq,telegram"
 * }
 * </pre>
 */
@Setter
@Getter
public class ConfirmBindResultPacket extends PacketWithCallBackId {
    /**
     * 操作是否成功
     */
    @SerializedName("success")
    private boolean success;

    /**
     * 操作结果消息
     */
    @SerializedName("message")
    private String message;

    /**
     * 已绑定的平台列表，以逗号分隔
     */
    @SerializedName("bound_platforms")
    private String boundPlatforms;
}
