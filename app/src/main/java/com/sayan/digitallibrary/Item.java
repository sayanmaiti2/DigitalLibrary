package com.sayan.digitallibrary;

public class Item {

    private String[] books = {
          "Programming in ANSI C", "Hands-On Machine Learning with Tensorflow", "Speech and Natural Language Processing", "E-Commerce : Strategy, Technology and Applications",
            "The Girl in Room 105", "Ikigai", "No Shortcuts", "Trails of Apollo"
    };

    private String[] authors = {
            "E. Balaguruswamy", "A. Geron", "D. Jurafsky and H. Martin", "D. Whiteley", "C. Bhagat", "F. Miralles and H. Garcia" , "N. Tripathi", "R. Riordan"
    };

    private String[] dates = {
            "7th July 2021",
            "6th July 2021",
            "5th July 2021",
            "4th July 2021",
            "3rd July 2021",
            "2nd July 2021",
            "1st July 2021",
            "30th June 2021",
            "29th June 2021",
            "28th June 2021",
            "27th June 2021",
            "26th June 2021",
            "25th June 2021",
            "24th June 2021",
            "23rd June 2021",
            "22nd June 2021",
            "21st June 2021",
            "20th June 2021",
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


    public int getDateCount() {
        return dates.length;
    }

    public String getDate(int i) {
        return dates[i];
    }
}
