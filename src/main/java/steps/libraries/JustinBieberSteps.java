package steps.libraries;

import base.Base;
import page.HomePage;

public class JustinBieberSteps  extends Base {
    HomePage homePage = new HomePage();
    public String getTrackInfo(){
        return homePage.trackInfo.getText();
    }
    public String nowPlayingAndRecentlyPlayContent(){
        return homePage.recentlyPlayedArtist.getText();
    }
}
