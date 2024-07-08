Feature: sign in on Amazon Website
@tag1
  Scenario: user sign in on amazon account
    Given user should be on amazon website12
    And user enters email address
    And user click on continue
    And user enter password1
    And user click on sign in1
    Then user will be on amazon home page
@tag2
Scenario: empty email address or phone number
Given user should be on amazon website13
    And user keep email field empty
    And user click continue1
    Then user get error Enter your e-mail address or mobile phone number
@tag3
Scenario: continue button
 Given user should be on amazon website14
    And user enters email address1
    And user click on continue2
@tag4
Scenario: password field empty
Given user should be on amazon website15
    And user enters email address2
    And user click on continue3
    And keep password field empty
    And user click on sign in2
    Then user get error Enter your password
    @tag5
    Scenario: incorrect password
  Given user should be on amazon website16
    And user enters email address3
    And user click on continue4
    And user enter incorret password
    And user click on sign in3
    Then user will get error Your password is incorrect
   