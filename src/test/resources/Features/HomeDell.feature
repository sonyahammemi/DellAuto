#Author: your.email@your.domain.com
Feature: Dell Home page

  Scenario: Selectionner un produit
    Given admin is on homepage
    When admin mousehover on menu "Ordinateurs et accessoires"  and submenu "Ordinateurs portables"
    And admin click on produit "Ordinateurs portables XPS"
    Then admin is directed to the page "Ordinateurs portables XPS"
