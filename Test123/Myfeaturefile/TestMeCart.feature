
Feature: Test me validation for the cart
@Sanity
  Scenario: user cross check for adding item in cart
    Given Application launched by registered user for cart
    Then  user verifyin add item
   @Regression 
  Scenario: user cross check for removind item in cart
  Given Application launched by registered user for cart
    Then  user verifyin remove item
    @Sanity @Regression
    Scenario: user cross check for max count in cart
    Given Application launched by registered user for cart
    Then  user verifies the max count of items in cart
    
    
   
  