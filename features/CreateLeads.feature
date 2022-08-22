Feature: Createlead in the Leaftaps Application

Background: Positive Login
Given Type the Username as 'DemoSalesManager'
And Type the Password as 'crmsfa'
When Click on the Login Button
Then Verify that homepage is displayed

Scenario Outline:
When Click on CRMSFA link
And Click on Leads
And Click on Create Lead Link
Then Enter the Companyname as <Companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on Create Button
Then Verify the title

Examples:
|Companyname|firstname|lastname|
|Infosys|Shivu|S|
|TCS|Shakthi|Shiv|