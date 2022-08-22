Feature: Login to the Leaftaps Application


Scenario: Positive Login
Given Type the Username as 'DemoSalesManager'
And Type the Password as 'crmsfa'
When Click on the Login Button
Then Verify that homepage is displayed

Scenario: Negative Login
Given Type the Username as 'Demo'
And Type the Password as 'crmsf'
When Click on the Login Button
But Verify that Error message is displayed
