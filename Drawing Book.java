/* Drawing Book
Brie’s Drawing teacher asks her class to open their -page book to page number . Brie can either start
turning pages from the front of the book (i.e., page number ) or from the back of the book (i.e., page
number ), and she always turns pages one-by-one (as opposed to skipping through multiple pages at
once). When she opens the book, page 1 is always on the right side:
Each page in the book has two sides, front and back, except for the last page which may only have a front
side depending on the total number of pages of the book (see the Explanation sections below for
additional diagrams).
Given and , find and print the minimum number of pages Brie must turn in order to arrive at page .
# Input Format
The first line contains an integer, , denoting the number of pages in the book.
The second line contains an integer, , denoting the page that Brie's teacher wants her to turn to.*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        
         int turn_page_count=n/2;
         int page_count_front=p/2;
        int page_count_back= turn_page_count - page_count_front;

        return (Math.min(page_count_front, page_count_back));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
