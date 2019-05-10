package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Carl Hiaasen", "Skinny Dip.", 2004, "LOL");
        Book book2 = new Book("Alie Brosh", "Hyperbole and a Half", 2009, "LOLZ");
        Book book3 = new Book("David Sedaris", "Me Talk Pretty One Day", 2000, "ROFL");
        Book book4 = new Book("Issa Rae" ,"The Misadventures of Akward Black Girl", 2015, "LMHO");
        Book book5 = new Book("Alissa Nutting", "Made For Love", 2017, "HAHA");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //when

        int medianPublicationYear = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(medianPublicationYear);
        assertEquals(medianPublicationYear, 2009);
    }
}
