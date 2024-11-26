Feature: Product 2
#TC1
  Scenario: Masuk ke halaman Product 2
    Given access url "https://hpam.co.id/product/2"
    Then Validasi URL product
#TC2-TC8
  Scenario Outline: Menampilkan grafik sesuai jangka waktu
    When User klik "<jangka waktu>"
    Then Validasi "<persentage>"
    Examples:
      | jangka waktu |  persentage |
      | 1D           |  (0.05%)      |
      | 1M           |  (0.46%)      |
      | 3M           |  (1.40%)      |
      | YTD          |  (4.66%)      |
      | 1Y           |  (5.15%)      |
      | 3Y           |  (14.26%)     |
      | 5Y           |  (26.95%)     |
#TC9
  Scenario: scroll
    Given scroll
#TC10-TC13
  Scenario Outline: Melakukan simulasi CAGR
    When Masukkan investasi "<nilai>"
    And Masukkan jangka "<tahun>"
    Then Menampilkan "<return>" dan "<type>"
    Examples:
      | nilai | tahun | return  | type    |
      | 0     | 32    | Rp 0,00    | negatif |
      | 001   | 2     | Rp 25,25   | negatif |
      | 1     | 1     | Rp 12,62   | positif |
      | 1     | 0     | Rp 0,00    | negatif |
#TC14
  Scenario: scroll
    Given scroll
#TC15
  Scenario: melihat dokumen
    When klik document prospectus
    And klik document fun fact sheet
#
