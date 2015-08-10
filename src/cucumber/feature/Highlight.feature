Feature: Test the Highlight feature

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app
When i download book
Then book should be opened

Scenario: Add Highlight
Given i navigate to a page
When i select text to highlight
Then i highlight the text
And text should be highlighted
And highlight is saved in TOC highlight list

When i delete the highlight
Then highlight should be deleted
And highlight is removed in TOC highlight list

