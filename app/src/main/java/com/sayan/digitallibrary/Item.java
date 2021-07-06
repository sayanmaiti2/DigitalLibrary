package com.sayan.digitallibrary;

public class Item {

    private String[] books = {
          "Programming in ANSI C", "Hands-On Machine Learning with Tensorflow", "Speech and Natural Language Processing", "E-Commerce : Strategy, Technology and Applications",
            "The Girl in Room 105", "Ikigai", "No Shortcuts", "Trails of Apollo"
    };

    private String[] authors = {
            "E. Balaguruswamy", "A. Geron", "D. Jurafsky and H. Martin", "D. Whiteley", "C. Bhagat", "F. Miralles and H. Garcia" , "N. Tripathi", "R. Riordan"
    };

    public int getBookCount() {
        return books.length;
    }

    public String getBook(int i) {
        return books[i];
    }

    public String getAuthor(int i) {
        return  authors[i];
    }
}
