Feature: Verify search products
  Scenario: Verifying search functionality on with given search term
    Given I am on the homepage "https://demo.nopcommerce.com/"
    When I enter searchterm in search textbox
    And click on the search button
    Then I should be see relavant result on the search page
