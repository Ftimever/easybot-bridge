package com.springwater.easybot.bridge.model;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.Nullable;

@Getter
@Setter
public class PlayerSkin {
    @Nullable
    private String skinUrl;

    @Nullable
    private String capeUrl;
}
