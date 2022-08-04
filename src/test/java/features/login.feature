Feature: Verify login
  As a registered user
  I should be able to login with valid data
  Background:
    Given I am on the homepage "https://demo.nopcommerce.com/"
    @smoke @regression @login
    Scenario Outline:
      When I click on the Login link
      Then I should be redirected to the login page
      When I enter valid email "<Email>"
      When I enter valid password "<Password>"
      And click on the register button
      Then I should be redirected to the account page
      Examples:
        |  Email|Password|
        |abc@gmail.com|123456|