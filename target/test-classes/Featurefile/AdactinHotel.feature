Feature: Adactin Project
#@run
Scenario Outline: Login Functionality
Given user is launching the application
When user is enterting the "<username>" in username field
And user is entering the "<password>" in the password field
Then user is click on login button

Examples:
|username|password|
|Jaiharis2323|ZE980J|
 
 
Scenario: Seraching Hotel
Given The user is directed to search hotel page
When the user is selecting the location from the location dropdown menu
And user is select the hotel
And user is select the room type
And user is select number of rooms
And user is enter the check in date
And user is enter the chech out date
And user is select adults count
And user is select children count
Then user is click on search button

Scenario: Selecting Hotel
Given The user is directed to the select hotel page
When the user is clicking the radio button of select hotel
Then user is click on continue

Scenario: Booking a Hotel
Given the user is directed to the booking a hotel page
When the user is entering the Firstname
And user is enter the lastname
And user is enter the billing address
And user is enter the credit card num
And user is select the credit card type
And user is select the month
And user is select the year
And user is enter cvv number
Then user is click on booknow
 