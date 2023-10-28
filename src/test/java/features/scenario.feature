Feature: cart

  Scenario: user add item to cart and remove it
    Given user open main page
    When  user search for "Mobile"
    And user filter the the brand and select last item
    And user add mobile to the cart
    Then success message appears
    And user delete mobile from cart
