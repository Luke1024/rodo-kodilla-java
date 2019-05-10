package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if(books.size() == 0) return 0;
        int sum = 0;


        for(Map.Entry<BookSignature, Book> entry : books.entrySet()) {
            sum += entry.getValue().getYearOfPublication();
        }
        return sum / books.size();
    }
    @Override
    public int medianPublicationYear(Map<B>)
}
