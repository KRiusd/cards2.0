package gent.timdemey.cards.services.panels.menu;

import java.util.Arrays;
import java.util.List;

import gent.timdemey.cards.services.contract.descriptors.ActionDescriptor;
import gent.timdemey.cards.services.contract.descriptors.ActionDescriptors;
import gent.timdemey.cards.services.contract.descriptors.SolShowTestActionDescriptors;
import gent.timdemey.cards.ui.panels.menu.MenuPanelManager;

public class SolShowTestMenuPanelManager extends MenuPanelManager
{

    protected List<ActionDescriptor> getMenuActionDescriptors()
    {
        return Arrays.asList(SolShowTestActionDescriptors.ad_fakegame, ActionDescriptors.QUIT);
    }
}
