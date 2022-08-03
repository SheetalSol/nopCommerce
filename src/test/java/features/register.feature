Feature: Verify registration
  As a User
  I should be able to register with valid data
  Background:
    Given I am on the homepage "https://demo.nopcommerce.com/"
    @register
  Scenario Outline:
      When I click on the register link on the homepage
      Then I should be redirected to the register page
      When I select gender "<Gender>"
      When I enter FirstName "<Firstname>"
      When I enter LastName "<LastName>"
      When I select Birthday "<Birthday>" from DropDownList
      When I select BirthMonth "<BirthMonth>" from DropDownList
      When I select BirthYear "<BirthYear>" from DropDownList
      When When I enter Email "<Email>"
      When I enter password "<Password>"
      When I enter ConfirmPassword "<ConfirmPassword>"
      And Click on the Register button
      Then I should be redirected to the RegisterPage

    Examples:
      |Gender| Firstname |Lastname  |Birthday|BirthMonth|BirthYear | Email | Password |ConfirmPassword|
      |Male  |Jethalal   | Ghada    | 01     |January | 1970       |abc@gmail.com| 123456| 123456     |