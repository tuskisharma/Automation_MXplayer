Feature: Testing Edit button on My List on Settings feature of MXPlayer 
Background:
Given I should be in MXPlayer Homepage
Scenario: To Test functionality of Edit button on My list of Settings feature of MXPlayer
When Click on Settings feature
And Click on My List feature
And Click on Edit button on My List 
And Click on select all checkbox
And Click on Discard
And Click on Edit button again
And Click on select all checkbox again
Then Click on Delete 