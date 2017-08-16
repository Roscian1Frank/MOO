@regression
Feature: search functionality working correctly

  Background:
    Given I open the Moo website

  @SearchProducts
  Scenario Outline: searching for a product
    When I search for a "<Product>"
    Then I should see correct products for "<Product>"

    Examples:
      | Product        |
      | business cards |
      | sdjfnjsdfj     |

  @Product_links
  Scenario Outline: searching for a product links
    When I see product link are displayed
    Then I check each "<Product link>" is working

    Examples:
      | Product link          |
      | Business Cards        |
      | Postcards             |
      | Square Business Cards |
      | NFC Business Cards+   |
      | Luxe Business Cards   |
      | Stickers              |

