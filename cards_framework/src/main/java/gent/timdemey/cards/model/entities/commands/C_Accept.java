package gent.timdemey.cards.model.entities.commands;

import java.util.UUID;

import gent.timdemey.cards.model.entities.commands.contract.CanExecuteResponse;
import gent.timdemey.cards.model.entities.commands.payload.P_Accept;
import gent.timdemey.cards.model.state.State;
import gent.timdemey.cards.services.context.Context;
import gent.timdemey.cards.services.context.ContextType;
import gent.timdemey.cards.utils.Debug;

public class C_Accept extends CommandBase
{
    public final UUID acceptedCommandId;
    
    public C_Accept (UUID acceptedCommandId)
    {
        this.acceptedCommandId = acceptedCommandId;
    }
    
    public C_Accept (P_Accept pl)
    {
        super(pl);
        
        this.acceptedCommandId = pl.acceptedCommandId;
    }
    
    @Override
    protected CanExecuteResponse canExecute(Context context, ContextType type, State state)
    {
        return CanExecuteResponse.no("This command is not intended to ever execute");
    }

    @Override
    protected void execute(Context context, ContextType type, State state)
    {
        throw new IllegalStateException("This command cannot be executed directly.");
    }

    @Override
    public String toDebugString()
    {
        return Debug.getKeyValue("acceptedCommandId", acceptedCommandId);
    }
}
