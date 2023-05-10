@ebay
Feature: Add product to basket

  Background:common scenario steps
    Given the user goes to the ebay homepage
    Then  selects the gift card from the deals and sales drop-down menu in the top bar
    And   click all filters button

  Scenario: The user should be able to list the products that meet the desired conditions and add them to the basket
    Then  clicks on the price and enters "500" and "1000"
    Then  clicks on the item position and enters the "10 km" distance
    Then  clicks delivery options and enters "Free Postage"
    Then  clicks on the show only and prefer "Sale items", "Deals & Savings" and "Accepts Best offer"
    Then  clicks on the seller and click "Sellers with eBay Stores"
    Then  verifies the conditions
    And   clicks apply button
    And   verifies that products are listed in the required criteria
    And   closes the page

  Scenario: No product should be listed outside the entered price range(negative test)

    Then  clicks on the price and enters "0" and "1500"
    And   clicks apply button
    And   verifies that the product prices are within the entered price value range


