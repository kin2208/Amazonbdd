
Feature: checking functionality of your order
  

  @tag1
  Scenario: your order functionality
    Given user is login on the account1
    When user click on your account4
    And user click on your order
    And user click on buy again
    Then user able to see past order
    
    @tag2
    Scenario: your order functionality
    Given user is login on the account1
    When user click on your account5
    And user click on your order1
    And user click on Notyet shipped
    Then user able to see past order1
    
    @tag3
    Scenario: your order functionality
    Given user is login on the account2
    When user click on your account6
    And user click on your order2
    And user click on cancelled order
    Then user able to see past order2