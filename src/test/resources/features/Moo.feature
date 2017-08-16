Feature: search functionality working correctly

  @SearchProducts
  Scenario Outline: searching for a product
    Given I open the Moo website
    When I search for a "<Product>"
    Then I should see correct products for "<Product>"

    Examples:
      | Product        |
      | business cards |
      | sdjfnjsdfj     |