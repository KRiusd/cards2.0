package gent.timdemey.cards.services.id;

import java.util.UUID;

import gent.timdemey.cards.readonlymodel.ReadOnlyCardStack;
import gent.timdemey.cards.readonlymodel.ReadOnlyPlayer;
import gent.timdemey.cards.services.interfaces.ISolShowIdService;

public class SolShowIdService extends IdService implements ISolShowIdService
{
    private static final String COMPID_SPECIALCOUNTER = "compid.specialcounter.%s";
    private static final String COMPID_SPECIALBACKGROUND = "compid.specialbackground.%s";
    private static final String COMPID_PLAYERNAME = "compid.playername.%s";
    private static final String COMPID_PLAYERNAME_BACKGROUND = "compid.playername.background.%s";
    private static final String COMPID_CARDAREA_BACKGROUND = "compid.cardarea.background.%s";
    private static final String COMPID_VS = "compid.vs";
    
    private static final String RESID_SPECIALBACKGROUND = "resid.specialcounter.%s";
    private static final String RESID_PLAYERNAME_BACKGROUND = "resid.playername.background.%s";
    private static final String RESID_CARDAREA_BACKGROUND = "resid.cardarea.background.%s";
    private static final String RESID_VS = "resid.vs";

    @Override
    public UUID createCardStackScalableResourceId(String cardStackType)
    {
        return getUUID(RESID_CARDSTACK, cardStackType); 
    }

    @Override
    public UUID createSpecialCounterComponentId(ReadOnlyCardStack cs)
    {
        return getUUID(COMPID_SPECIALCOUNTER, cs.getId().toString());
    }

    @Override
    public UUID createSpecialBackgroundResourceId(boolean remote)
    {
        return getUUID(RESID_SPECIALBACKGROUND, Boolean.toString(remote));
    }

    @Override
    public UUID createSpecialBackgroundComponentId(ReadOnlyCardStack cs)
    {
        return getUUID(COMPID_SPECIALBACKGROUND, cs.getId().toString());
    }

    @Override
    public UUID createPlayerNameComponentId(ReadOnlyPlayer player)
    {
        return getUUID(COMPID_PLAYERNAME, player.getId().toString());
    }

    @Override
    public UUID createPlayerBgResourceId(boolean remote)
    {
        return getUUID(RESID_PLAYERNAME_BACKGROUND, Boolean.toString(remote));
    }

    @Override
    public UUID createCardAreaBgResourceId(boolean remote)
    {
        return getUUID(RESID_CARDAREA_BACKGROUND, Boolean.toString(remote));
    }
    
    @Override
    public UUID createPlayerBgComponentId(boolean remote)
    {
        return getUUID(COMPID_PLAYERNAME_BACKGROUND, Boolean.toString(remote));
    }

    @Override
    public UUID createCardAreaBgComponentId(boolean remote)
    {
        return getUUID(COMPID_CARDAREA_BACKGROUND, Boolean.toString(remote));
    }

    @Override
    public UUID createVsComponentId()
    {
        return getUUID(COMPID_VS);
    }

    @Override
    public UUID createVsResourceId()
    {
        return getUUID(RESID_VS);
    }
}
