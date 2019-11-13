package com.example.hw10;

class StringConversion {
    private int prize ;
    private String[] prizetext = {"恭喜獎金20萬元", "恭喜獎金4萬元", "恭喜獎金1萬元", "恭喜獎金4千元", "恭喜獎金1千元", "恭喜獎金2百元"};

    StringConversion(int Prize) {
        prize = Prize;
    }

    String get_String() {
        return prizetext[prize];
    }
}
