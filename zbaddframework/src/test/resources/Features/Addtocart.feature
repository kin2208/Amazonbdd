Feature: feature to test amazon search functionality
@tag1
  Scenario: validate amazon search is working
    
    Given user is on amazon website13
    Then user should be on check out page

    @tag2
 Scenario: increase quantity in cart
 Given user is on amazon website14
 And user increase quantity in cart
 Then user should be on checkout page
 @tag3
 Scenario: remove item from cart
 Given user is on amazon website15
 And user delete in cart
 