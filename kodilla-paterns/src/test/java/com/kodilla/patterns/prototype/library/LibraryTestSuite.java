package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        //creating the books
        Book book1 =
                new Book("Book 1",
                        "Writer 1",
                        LocalDate.of(10,10,10));

        Book book2 =
                new Book("Book 2",
                        "Writer 2",
                        LocalDate.of(2019,3,8));

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);

        Library cloneLibrary = null;
        try{
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepLibraryCloned = null;
        try{
            deepLibraryCloned = library.deepCopy();
            deepLibraryCloned.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepLibraryCloned);
        Assert.assertEquals(1, library.getBooks().size());
        Assert.assertEquals(1, cloneLibrary.getBooks().size());
        Assert.assertEquals(2, deepLibraryCloned.getBooks().size());
    }
}
