Feature: EditLead in the Leaftaps Application

Background: Positive Login
Given Type the Username as 'DemoSalesManager'
And Type the Password as 'crmsfa'
When Click on the Login Button
Then Verify that homepage is displayed

Scenario Outline:
When Click on CRMSFA link
And Click on Leads
And Click Find leads Link
Then Give the firstname as <firstname>
And Click on Find leads button
Then Click on first resulting lead
And Click on Edit
Then Change the company name <Companyname>
And Click on Update
Then Confirm the changed Company name appears

Examples:
|firstname|Companyname|
|Shivu|Wipro|