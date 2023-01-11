package steps.definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import steps.libraries.CommonStep;
import steps.libraries.JustinBieberSteps;

@Log4j2
public class JustinBieberStepDefinition {
    JustinBieberSteps justinBieberSteps = new JustinBieberSteps();
    CommonStep commonStep = new CommonStep();

    @Given("user is on the capital fm london {string}")
    public void userIsOnTheCapitalFmLondon(String page) {
        commonStep.OpenPage(page);
    }

    @And("Justin Bieber is playing or recently play")
    public void justinBieberIsPlaying() {
        justinBieberSteps.getTrackInfo();
        System.out.println(justinBieberSteps.getTrackInfo());
    }

    @Then("Now PLAYING or recently played should display {string} the song title")
    public void nowPLAYINGArtistTrackInformationShouldDisplay(String justinBieber) {
        if (justinBieberSteps.nowPlayingAndRecentlyPlayContent().contains(justinBieber)) {
            Assert.assertTrue(true);
            log.info(justinBieber + "is playing now ");
        } else {
            Assert.assertFalse(false);
            log.info(justinBieber + "is not playing now ");
        }
    }
}
