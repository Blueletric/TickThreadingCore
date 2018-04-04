package com.blue.tickthreadingcore;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

public class TickThreadingContainer extends DummyModContainer {

    public TickThreadingContainer() {
        super(new ModMetadata());
        ModMetadata metadata = getMetadata();
        metadata.modId = "tick_threading_core";
        metadata.name = "Minecraft_Tick_Threading_Core";
        metadata.description = "Adds threading to Minecraft world ticking";
        metadata.version = "0.0.1";
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller) {
        bus.register(this);
        return true;
    }
}
