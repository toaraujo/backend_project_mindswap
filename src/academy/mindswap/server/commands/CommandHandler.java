package academy.mindswap.server.commands;

import academy.mindswap.client.Player;
import academy.mindswap.server.Game;
import academy.mindswap.server.Server;

public interface CommandHandler {
    void execute(Server server, Server.PlayerConnectionHandler clientConnectionHandler, Player player, Game game);
}
