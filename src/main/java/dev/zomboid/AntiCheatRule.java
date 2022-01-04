package dev.zomboid;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AntiCheatRule {

    @SerializedName("enabled")
    private boolean enabled;

    @SerializedName("action")
    private AntiCheatAction action;

    public AntiCheatRule(boolean enabled) {
        this.enabled = enabled;
        this.action = AntiCheatAction.DISCONNECT;
    }

    public AntiCheatRule(boolean enabled, AntiCheatAction action) {
        this.enabled = enabled;
        this.action = action;
    }

    @Override
    public String toString() {
        return "AntiCheatRule{" +
                "enabled=" + enabled +
                ", action=" + action +
                '}';
    }
}
