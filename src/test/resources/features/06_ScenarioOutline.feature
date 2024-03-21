#Scenario outline DDT(Data Driven Test) yapma yetenegi saglar
#Testimiz tabloda bulunan satir sayisi(ilk satir haric) kadar sirasiyla her bir satirdaki verilerle calistirilir
#Scenario outline da parametrreli stepler kullanilir
#Parametre kisimlari hardCode olmadan examples tablosunda belirtilen basliklara gonderilir
  # <> isaretleri arasinda yer lan character blogu parametre olarak algilanmasi icin stepdefinitions tanimlamasi
  # yapildiktan sonra stepdefinition class i icerisinde gerekli duzeltmelerin yapilmasi gerekir.
  # Ornegin <sayi1> step definition da <sayi{int}> olarak yer alir, onu biz {int} olarak degistirmemiz gerekir
@dortIslem
Feature: Dort islem
  Scenario Outline: cucumber step definition with Scenario outline
    Given ilk sayi <sayi1>
    # burada sayi1 yazinca sadece 1 i integer olaark algiladi.
    # o yuzden stepdefinitions da duzeltme yaptik.
    # <sayi{int}> i {int} yaptik ki sayi olarak algilansin.
    And ikinci sayi <sayi2>
    When bu sayilar <operator> operatorune girdiginde
    Then sonuc <sonuc> olmalidir

    Examples:
      |sayi1|sayi2|operator|sonuc|
      | 10  |   5 |   +  |  15   |
      | 5   |  12 |   *  |  60   |
      | 10  |   5 |   -  |  5    |
      | 10  |   2 |   /  |  5    |


    # https://github.com/cucumber/cucumber-expressions#readme