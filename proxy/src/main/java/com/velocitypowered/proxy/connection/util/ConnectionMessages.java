package com.velocitypowered.proxy.connection.util;

import com.velocitypowered.proxy.VelocityServer;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;

public class ConnectionMessages {

  public static final TextComponent ALREADY_CONNECTED = VelocityServer.getLocalizationString("already_connected");
  public static final TextComponent IN_PROGRESS = VelocityServer.getLocalizationString("connection_in_progress");
  public static final TextComponent INTERNAL_SERVER_CONNECTION_ERROR = VelocityServer.getLocalizationString("internal_error");

  private ConnectionMessages() {
    throw new AssertionError();
  }
}
