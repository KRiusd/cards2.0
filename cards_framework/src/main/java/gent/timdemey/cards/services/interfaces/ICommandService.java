package gent.timdemey.cards.services.interfaces;

import java.util.List;
import java.util.UUID;

import gent.timdemey.cards.model.entities.commands.C_Move;
import gent.timdemey.cards.model.entities.commands.C_Pull;
import gent.timdemey.cards.model.entities.commands.C_Push;
import gent.timdemey.cards.model.entities.commands.C_Use;

public interface ICommandService
{
    public C_Move getMoveCommand(UUID playerId, UUID srcCardStackId, UUID dstCardStackId, UUID cardId);

    public C_Use getUseCommand(UUID playerId, UUID srcCardStackId, UUID srcCardId);

    public C_Pull getPullCommand(UUID playerId, UUID srcCardStackId, UUID cardId);

    public C_Push getPushCommand(UUID playerId, UUID dstCardStackId, List<UUID> srcCardIds);        
}
