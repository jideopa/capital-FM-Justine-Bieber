Feature: Track information

  @smoke
  Scenario: Check if Justin Bieber is playing
    Given user is on the capital fm london "homepage"
    And Justin Bieber is playing or recently play
    Then Now PLAYING or recently played should display "Justin Bieber" the song title
