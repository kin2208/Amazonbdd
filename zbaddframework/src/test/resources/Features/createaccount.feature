Feature: create new account on amazon website

  @tag1
  Scenario: user create new account
    Given user should be on amazon website
    When user hover mouse on hello,sign in
    
    And user enter your name
    And user enter email or mobile number
    And user enter password
    And user enter password again
    And user click on verify email
    Then user will able to amazon home page
    @tag2
    Scenario: your name empty
    Given user uhould on amazon website2
    When user hover mouse on hello, sign in1
    And user enter email or mobile number1
    And user enter password3
    And user enter password again3
    And user click on verify email1
    Then user will able to amazon home page1
    @tag3
    Scenario: Email empty
    Given user should be on amazon website3
    When user hover mouse on hello,sign in2
     And user enter your name1
     And user keep email or mobile number empty
    And user enter password4
    And user enter password again4
    And user click on verify email2
    Then user will able to amazon home page2
    @tag4
    Scenario: partial phonenumber
    Given user should be on amazon website4
    When user hover mouse on hello,sign in4
    And user enter your name2
    And user partially enter phonenumber1
    And user enter password5
    And user enter password again5
    And user click on verify phonenumber
    Then user will able to amazon home page3
    @tag5
    Scenario: partial email
    Given user should be on amazon website5
    When user hover mouse on hello,sign in5
    And user enter your name3
    And user partially enter email 
    And user enter password6
    And user enter password again6
    And user click on verify email3
    Then user will able to amazon home page4
    @tag6
    Scenario: invalid password
    Given user should be on amazon website6
    When user hover mouse on hello,sign in6
    And user enter your name4
    And user enter email or mobile number2
    And user enter password with character5
    And user enter password again7
    And user click on verify email4
    Then user will able to amazon home page5
    @tag7
    Scenario: password field empty
     Given user should be on amazon website7
    When user hover mouse on hello,sign in7
    And user enter your name5
    And user enter email or mobile number3
    And user enter password again8
    And user click on verify email5
    Then user will able to amazon home page6
    @tag8
    Scenario: different value in password again
    Given user should be on amazon website8
    When user hover mouse on hello,sign in8
    
    And user enter your name6
    And user enter email or mobile number4
    And user enter password7
    And user enter different pasword
    And user click on verify email6
    Then user will able to amazon home page7

    
    
