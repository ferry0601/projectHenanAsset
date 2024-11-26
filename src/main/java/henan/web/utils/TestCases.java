package henan.web.utils;

public enum TestCases {
    T1("Masuk ke halaman Product 2"),
    T2("Menampilkan grafik sesuai jangka waktu 1D"),
    T3("Menampilkan grafik sesuai jangka waktu 1M"),
    T4("Menampilkan grafik sesuai jangka waktu 3M"),
    T5("Menampilkan grafik sesuai jangka waktu YTD"),
    T6("Menampilkan grafik sesuai jangka waktu 1Y"),
    T7("Menampilkan grafik sesuai jangka waktu 3Y"),
    T8("Menampilkan grafik sesuai jangka waktu 5Y"),
    T9("SCROLL"),
    T10("Melakukan simulasi CAGR negatif 1"),
    T11("Melakukan simulasi CAGR negatif 2"),
    T12("Melakukan simulasi CAGR positif 1"),
    T13("Melakukan simulasi CAGR negatif 3"),
    T14("SCROLL"),
    T15("Melihat Dokument"),
//    T16("tampil data reliability greater than 98%"),
//    T17("tampil data reliability greater than 0-100%"),
//    T18("tampil data reliability regional jakarta 3"),
//    T19("masuk ke monitoring"),
//    T20("masuk monitoring setting"),
//    T21("filter data monitoring"),
//    T22("masukkan cctv ke list"),
//    T23("masukkan lebih dari 9 cctv"),
//    T24("aktifkan cctv monitoring"),
//    T25("Logout"),
//    T26(""),
    ;
    private String testCaseName;
    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
