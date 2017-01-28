package com.aceshub.coepsocialnetworkingapp.model;

import com.aceshub.coepsocialnetworkingapp.R;

public class UIData {

    //Tab Names(Main Activity)
    private final String[] MAIN_ACTIVITY_TAB_NAMES = new String[]{
            "NOTIFICATIONS",
            "PING",
            "PROFILE"
    };

    //Tab Names(Home Fragment)
    private final String[] HOME_FRAGMENT_TAB_NAMES = new String[]{
            "FEED",
            "SAVED QUEs",
            "EVENT",
            "FORUM"
    };

    //Tab Icons
    private final int[] ICONS_NORMAL = new int[]{
            R.drawable.notifications_icon,
            R.drawable.home_icon,
            R.drawable.profile_icon
    };
    private final int[] ICONS_SELECTED = new int[]{
            R.drawable.notifications_selected,
            R.drawable.home_selected,
            R.drawable.profile_selected
    };

    public String getMainActivityTabName(int i) {
        return MAIN_ACTIVITY_TAB_NAMES[i];
    }

    public String getHomeFragmentTabName(int i) {
        return HOME_FRAGMENT_TAB_NAMES[i];
    }

    public int mainActivityTabsCount() {
        return MAIN_ACTIVITY_TAB_NAMES.length;
    }

    public int homeFragmentTabsCount() {
        return HOME_FRAGMENT_TAB_NAMES.length;
    }

    public int getIconNormal(int i) {
        return ICONS_NORMAL[i];
    }

    public int getIconSelected(int i) {
        return ICONS_SELECTED[i];
    }

}
