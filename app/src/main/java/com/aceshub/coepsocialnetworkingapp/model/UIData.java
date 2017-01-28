package com.aceshub.coepsocialnetworkingapp.model;

import com.aceshub.coepsocialnetworkingapp.R;

public class UIData {

    //Tab Names
    private String[] mainActivityTabNames = new String[]{
            "NOTIFICATIONS",
            "PING",
            "PROFILE"
    };

    //Tab Icons
    private int[] ICONS_NORMAL = new int[]{
            R.drawable.notifications_icon,
            R.drawable.home_icon,
            R.drawable.profile_icon
    };
    private int[] ICONS_SELECTED = new int[]{
            R.drawable.notifications_selected,
            R.drawable.home_selected,
            R.drawable.profile_selected
    };

    public String getMainActivityTabName(int i) {
        return mainActivityTabNames[i];
    }

    public int getIconNormal(int i) {
        return ICONS_NORMAL[i];
    }

    public int getIconSelected(int i) {
        return ICONS_SELECTED[i];
    }

}
