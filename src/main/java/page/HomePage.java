package page;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    @FindBy(css =  ".track__track-info")
    public WebElement trackInfo;
    @FindBy(css =  ".player_button__label")
    public WebElement listenIcon;

    @FindBy(css =  " button[title='ACCEPT']")
    public WebElement cookieAccept;

    @FindBy(css = "body[class='js']")
    public WebElement documentBody;

    @FindBy(css = ".now_playing_card_loader")
    public WebElement recentlyPlayedArtist;



    public HomePage(){
       PageFactory.initElements(driver,this);
    }

}
