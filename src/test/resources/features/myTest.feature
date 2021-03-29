Feature:Button Clicks







  Scenario: Check the messages in the Button Clicks tab
    Given I am on the webdriveruniversity site
    When I click on the BUTTON CLICKS
    And I switch to another tab
    When I click on the first button
    Then I check the first message
    When I click on the second button
    Then I check the second message
    When I click on the third button
    Then I check the third message