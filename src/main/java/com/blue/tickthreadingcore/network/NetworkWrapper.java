package com.blue.tickthreadingcore.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;



public class NetworkWrapper {

	public final SimpleNetworkWrapper network;
	protected final AbstractPacketHandler handler;
	private int id = 0;

	public NetworkWrapper(String channelName) {
		network = NetworkRegistry.INSTANCE.newSimpleChannel(channelName);
		handler = new AbstractPacketHandler();
	}


	public void registerPacket(class<? extends AbstractPacket> packetclazz) {

	}
}
