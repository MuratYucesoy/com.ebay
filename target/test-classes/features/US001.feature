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

  Scenario: The user lists products with different conditions and adds them to the basket

    Then  clicks on the price and enters "100" and "1500"
    Then  clicks on the item position and enters the "50 km" distance
    Then  clicks delivery options and enters "Free Postage"
    Then  clicks on the show only and prefer "Accepts Best offer"
    Then  clicks on the seller and click "Sellers with eBay Stores"
    And   clicks apply button


