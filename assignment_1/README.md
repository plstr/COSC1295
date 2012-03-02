COSC1290/1295 Java for Programmers
==================================
Semester 1 2012
School of CS and IT, RMIT University
Assignment 1

Introduction
You are required to implement a basic Java program using Java SE 5.0.
This assignment is designed to:
• Test your knowledge of basic Java concepts;
• Evaluate your ability to design programming logic;
• Practice simple object design in Java.
• This is an individual assignment and worth 10% towards your final 
grade.

Academic Integrity
The submitted assignment must be your own work. No marks will be awarded 
for any parts, which are not created by you.
    Plagiarism is treated very seriously at RMIT. Plagiarism includes copying 
    code directly from other students, Internet or other resources without
    proper 
    reference. Sometimes, students study and work on assignments together and 
    submit similar files which may be regarded as  plagiarism. Please note that 
    you should always create your own assignment even if you have very similar 
    ideas. Plagiarism-detection tools will be used for all submissions.
    Penalties 
    may be applied in cases of plagiarism.

    Assignment Specifications
    A new online movie store called VidFix aims to become one of the first and 
    most prominent of its kind in Australia. The company  has acquired a large 
    collection of popular mainstream movies and TV-Shows and  the 
    corresponding licenses to distribute them.  Since,  VidFix  only  offers
    its 
    customers soft copies (downloads) of its media content, users who purchase 
    a movie are able to download and store their movie permanently while users 
    who rent are allowed to retain a copy of the movie for a preset period of
    time.
    To enforce this limitation VidFix allows users to rent only a limited
    number of 
    movies at a time. 

    Your task in this assignment is to build a system for VidFix that allows
    its 
    customer to navigate, purchase and rent movies\TV-Shows from the 
    company’s media library.  
    Specifically the system  you build  would  need to 
    provide the following functionalities:
    - Allow users to buy and rent movies from the library- Allow users to view
      a list of movies that they have rented and purchased 
      - Allow users to search  movies  by  entering the title (or partial
        title) of a 
        movie. 
        - Currently VidFix allows users to rent up to two movies at a time,
          after 
          which point they are expected to delete one or both of their existing
          rental
          (s) first (using the VidFix System) before renting  another movie.
          Your 
          system must enforce this restriction.
          - Since not all movies are purchasable, VidFix would like its users
            to clearly 
            be advised of what their options are for a specific media (buy\rent
            or both) 
            as they search through the library. 
            Below is a sample interaction of the VidFix system with a user,
            which you can 
            use as  guidance in your own implementation (Note that you do not 
            necessarily have to follow this menu structure)

            Example 1: Renting a Movie
            ==================================
            MAIN MENU
            ==================================
            1. Rent Movie
            2. Buy Movie
            3. List Current Rentals
            4. List Purchased Movies
            > Please enter an option: 1
            > Please enter the title of the movie you would like to rent:
            matrix
              The following matches were found for “matrix”:
              1. Matrix, The (Rent | Buy)
              2. Matrix Reloaded, The (Rent | Buy)
              3. Matrix Revolution, The (Rent Only)
              0. BACK TO MAIN MENU
              > Please enter the index number for the movie you would like 
              to rent: 3
              Thank you for renting “Matrix Revolution, The”, it has
              now 
              been added to your rental list

              * NOTE: Notice how in the above example the options available 
              for a movie are listed next to the title (i.e. Rent | Buy 
                  etc.)
                  * NOTE: The above process would need to check whether a user 
                  has already rented two movies (i.e. reached the rental
                  limit), if so it should prompt the user to delete an existing
                  rental 
                  before attempting to rent a new one and direct the user to
                  the 
                  Current Rentals List view (see example 3 below).

                  Example 2: Purchasing a Movie
                  ==================================
                  MAIN MENU
                  ==================================
                  1. Rent Movie
                  2. Buy Movie
                  3. List Current Rentals
                  4. List Purchased Movies
                  > Please enter an option: 2
                  > Please enter the title of the movie you would like to 
                  purchase: matrix
                    The following matches were found for “matrix”:
                    1. Matrix, The (Rent | Buy)
                    2. Matrix Reloaded, The (Rent | Buy)
                    0. BACK TO MAIN MENU
                    > Please select the movie you would like to purchase: 2
                    Thank you for purchasing “Matrix Reloaded, The”, it
                    is now 
                    available for viewing under your purchased movies list

                    * NOTE: Notice how “Rent only” movies are excluded
                    * from the 
                    search result above

                    Example 3: Viewing Rental Record
                    ==================================
                    MAIN MENU
                    ==================================
                    1. Rent Movie
                    2. Buy Movie
                    3. List Current Rentals
                    4. List Purchased Movies
                    > Please enter an option: 3
                    > Below is your list of rented movies:
                    1. Matrix Revolution, The
                    0. BACK TO MAIN MENU
                    > Please enter the index number of the rental to delete: 1
                    > Successfully removed rental from list4. Example 4:
                    > Viewing Purchase Record
                    ==================================
                    MAIN MENU
                    ==================================
                    1. Rent Movie
                    2. Buy Movie
                    3. List Current Rentals
                    4. List Purchased Movies
                    > Please enter an option: 4
                    > Below is a list of movies you have purchased:
                    1. Matrix Reloaded, The
                    0. BACK TO MAIN MENU

                    Implementation Requirements:
                    - You must incorporate basic object oriented concepts into
                      your 
                      program. In particular, define a Movie class that
                      encapsulates all the
                      information relating to a movie (title, release year,
                      genre, etc.) and provide
                      appropriate accessors and mutators for them. Using this
                      approach you 
                      must maintain ONLY ONE ARRAY containing all the Movies in
                      the VidFix 
                      media Library.
                      - Make sure to leverage toLowerCase(), contains() and\or
                        startsWith() 
                        methods of the String class to allow for searching of
                        your list of movies.

                        Sample List of Movies for testing purposes

                        The data can be hardcoded as a collection of Movie
                        instances using the 
                        appropriate data structure into your system for this
                        assignment

                        Title Year Genre Status
                        The Avengers 2012
                        Action | Adventure | 
                        Sci-Fi
                        Rent
                        Blade Runner 1982 Drama | Sci-Fi | Thriller Rent | Buy
                        Chronicle 2012 Action | Drama | Sci-Fi Rent
                        Matrix, The 1999
                        Action | Adventure | 
                        Sci-Fi
                        Rent | Buy
                        Matrix 
                        Reloaded, The
                        2003
                        Action | Adventure | 
                        Sci-Fi
                        Rent | Buy
                        Matrix 
                        Revolutions, 
                        The
                        2003
                        Action | Adventure | 
                        Sci-Fi
                        Rent 
                        Star Wars: A 
                        New Hope
                        1977
                        Action | Adventure | 
                        Fantasy
                        Rent | Buy

                        General Requirements 
                        • You programs should validate user inputs. Your
                        programs should not 
                        crash or display unexpected data upon invalid input.
                        (e.g. Entry of an 
                        invalid menu option number in the Main Menu or other
                        menus etc.)
                        • All programs should compile and run on Yallara. 
                        • Marks will be deducted if you do not follow good
                        coding styles in 
                        comments, consistent indentations, etc. (See 
                        http://java.sun.com/docs/codeconv/CodeConventions.pdf). 

                        Submission 
                        Your progress on this assignment will be assessed in
                        the lab a week before 
                        the submission date (worth 1%). Refer to the course
                        guide for details on the 
                        assessment structure for this course
                        Assignment submission should be made via Weblearn by
                        the due date (March 
                        23, 2012 (end of Week 4)). 
                        You must include in your submission all your *.java
                        files (do not include 
                        *.class files), archived into one .ZIP file.
                        You can submit your assignment as many times as you
                        want before the due 
                        date. Each submission will overwrite any previous
                        submissions. 
                        Late submissions will incur a penalty of 10% per day.
                        Submissions made 5 
                        days after the due date will receive no marks. 
                        Further Information 
                        Any further inquiries regarding this assignment should
                        be raised in 
                        appropriate discussion forum in Blackboard.
