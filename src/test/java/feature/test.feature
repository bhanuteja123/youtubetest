@test
Feature: testing

  Background: test
    Given The testing "bhanu"
    When The Bhanu "<teja>"

  Scenario Outline: basic test
    Given the test "Sure"
    When  the sure "<gf>"
    Then the <Sure>
    Examples:
      | bhanu     |  | teja      |  | Sure                |  | gf                  |
      | Bhanuteja |  | Surampudi |  | Bhanuteja Surampudi |  | Surampudi Bhanuteja |
      | test      |  | testing   |  | tested              |  | has tested          |

  Scenario Outline: Basic test 2
    Given asfafasa
    Then fafafafaf
    Examples:
      | bhanu         |  | teja       |
      | asasdafadfadf |  | iggkgyukyu |