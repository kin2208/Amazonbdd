Feature: Adding new address in Amazon Page
@tag1
Scenario: Add new address option
Given user is logged in
When user clicks on your account
Then user should be able to click on your address
@tag2
Scenario: Full name field empty
Given you are on add new address page
When you enter your phone number
And you enter your address
And you enter your city
And you select your province
And you enter your postal code
And you click on add address
Then you should get an error saying fullname is mandatory
@tag3
Scenario: Phone Number field empty
Given you are on add new address page1
When you enter your fullname
And you enter your address1
And you enter your city1
And you select your province1
And you enter your postal code1
And you click on add address1
Then you should get an error saying phonenumber is mandatory
@tag4
Scenario: address field empty
Given you are on add new address page2
When you enter your fullname2
And you enter your phonenumber2
And you enter your city2
And you select your province2
And you enter your postal code2
And you click on add address2
Then you should get an error saying address is mandatory
@tag5
Scenario: City field empty
Given you are on add new address page3
When you enter your fullname3
And you enter your address3
And you enter your phonenumber3

And you select your province3
And you enter your postal code3
And you click on add address3
Then you should get an error saying city is mandatory
@tag6
Scenario: Without Selecting a province
Given you are on add new address page4
When you enter your fullname4
And you enter your address4
And you enter your city4
And you enter your phonenumber4
And you enter your postal code4
And you click on add address4
Then you should get an error saying selecting a province is mandatory
@tag7
Scenario: Postalcode field empty
Given you are on add new address page5
When you enter your fullname5
And you enter your address5
And you enter your city5
And you select your province5
And you enter your phonenumber5
And you click on add address5
Then you should get an error saying postalcode is mandatory
@tag8
Scenario: All valid data
Given you are on add new address page6
When you enter your fullname6
And you enter your phonenumber6
And you enter your address6
And you enter your city6
And you select your province6
And you enter your postal code6
And click on make it default
And enter the preferences required
And you click on add address6
Then your address should be saved and made as default