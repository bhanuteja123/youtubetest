@Filter_options
Feature: Check in the Filter options

  Background: 
    Given The user is opened into youtube
    Then the user is sign in into youtube
    Then the user searched for video
    Then the user click on filters

  #Upload tags
  Scenario: Search by last hour
    Then Select the Last hour tag

  Scenario: Search by today
    Then Select the By today tag

  Scenario: Search by This week
    Then Select This week tag

  Scenario: Search by This month
    Then Select the This month tag

  Scenario: Search by This year
    Then Select  This year tag

  #Type tags
  Scenario: Search by video
    Then Select the video tag

  Scenario: Search by Channel
    Then Select the by Channel tag

  Scenario: Search by Playlist
    Then Select by Playlist tag

  Scenario: Search by Film
    Then Select by Film tag

  Scenario: Search by Programme
    Then Select by Programme tag

  #Duration
  Scenario: Search by short
    Then Select by short tag

  Scenario: Search by long
    Then Select by long tag

  #features
  Scenario: Search by 4K
    Then Select the <4K> tag

  Scenario: Search by HD
    Then Select by HD tag

  Scenario: Search by Subtitles/CC
    Then Select by Subtitles/CC tag

  Scenario: Search by Creative Commons
    Then Select by Creative Commons tag

  Scenario: Search by <3D>
    Then Select by <3D> tag

  Scenario: Search by Live
    Then Select by Live tag

  Scenario: Search by Purchased
    Then Select by Purchased tag

  Scenario: Search by 360
    Then Select by 360 tag

  #sortby
  Scenario: Search by Relevance
    Then Select the Relevance tag

  Scenario: Search by Upload date
    Then Select the by Upload date tag

  Scenario: Search by View count
    Then Select by View count tag

  Scenario: Search by Rating
    Then Select by Rating tag
