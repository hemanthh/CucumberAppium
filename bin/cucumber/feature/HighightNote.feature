Feature: Test the Highlight note

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app
When i download book
Then book should be opened

Scenario: Add Highlight note
Given i navigate to a page
When i select text to highlight
Then i add note to the text
And note should be saved
And highlightnote is saved in TOC highlight list

When i select text to highlight
Then i delete note 
And note is deleted
And highlight note is removed in TOC highlight list