package Array;
/*
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3236/
 */

import java.util.Arrays;

// A simple definition for a DVD.
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

    public static void main(String[] args) {
        // The actual code for creating an Array to hold DVD's.
        DVD[] dvdCollection = new DVD[15];

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        dvdCollection[7] = avengersDVD;
        dvdCollection[3] = incrediblesDVD;
        dvdCollection[9] = findingDoryDVD;
        dvdCollection[2] = lionKingDVD;

        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;

        // Print out what's in indexes 7, 10, and 3.
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);

        // Printing all 15 values from the array
        System.out.println(Arrays.toString(dvdCollection));

        // The actual code for creating an Array to hold integer values of 5 DVD's.
        int[] dvdReleaseYear = new int[5];
        dvdReleaseYear[0] = 2010;
        dvdReleaseYear[1] = 2011;
        dvdReleaseYear[2] = 2012;
        dvdReleaseYear[3] = 2013;
        dvdReleaseYear[4] = 2014;
        System.out.println(Arrays.toString(dvdReleaseYear));
    }
}
