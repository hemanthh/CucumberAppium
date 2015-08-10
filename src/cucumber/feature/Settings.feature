Feature: Test the settings feature

Background: 
Given i launch the app
When i enter login credentials
And i login to the app
Given i logged in to the app

Scenario: Deregister Device
Given i navigate to settings in library page
When i Deregister a device
Then device should be deregistered
