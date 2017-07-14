package de.alphahelix.almnetty.handler;

import de.alphahelix.almnetty.channel.ChannelWrapper;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

public class SentPacket extends PacketAbstract {
    public SentPacket(Object packet, Cancellable cancellable, Player player) {
        super(packet, cancellable, player);
    }

    public SentPacket(Object packet, Cancellable cancellable, ChannelWrapper<?> channelWrapper) {
        super(packet, cancellable, channelWrapper);
    }
}
