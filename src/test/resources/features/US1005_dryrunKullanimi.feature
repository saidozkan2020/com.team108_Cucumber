Feature: US1005 Kullanici amazonda urun aratip 2.ürün detaylarini test eder

  Scenario: TC09 Kullanici arama sonuclarinda istedigi ürünü test edebilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    When amazonda "Nutella" icin arama yapar
    And 5 saniye bekler
    And 3.urune gider
    Then urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir

