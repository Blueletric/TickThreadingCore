package com.blue.tickthreadingcore;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion("1.12.2")
@IFMLLoadingPlugin.TransformerExclusions({"com.blue.tickthreadingcore"})
@IFMLLoadingPlugin.Name("Minecraft_Tick_Threading_Core")
public class TickThreadingCore implements IFMLLoadingPlugin {
    @Override
    public String[] getASMTransformerClass() {
        System.out.println("GetASMTransformerClass called");
        return new String[] {"com.blue.tickthreadingcore.TickThreadingClassTransformer"};
    }

    @Override
    public String getModContainerClass() {
        System.out.println("GetModContainerClass called");
        return "com.blue.tickthreadingcore.TickThreadingContainer";
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
