/* 5/18/15
-- HASHING/HASH TABLES --
You want to store all info on Stuy students in a data structure
You want to optimize for...
1. Finding a student based on 4 digit ID
2. Adding a student by 4 digit ID
3. Changing a student (found by 4 digit ID)

You can use an Array with the ID numbers as the index
However, we would be using 10k slots for 3k students. This is not too much space
wasted. However, if we used OSIS number, we would have to make an array of 1
billion for 3k students
We can do even better by cutting down the array to a size of 4000. Just adjust
the IDs such that it fits into the array. Ex) 2792 - 1000 = index
You can do this with OSIS numbers by taking the last four numbers in the number

Hashing
- We want to store things in a table by index (Array).
- We have to take a unique ID and convert it into a table index to store it.
- Hash function h(x) is a mapping function
  * It takes a piece of information and converts it into an index in our hash
    table.
    * EX) OSIS numbers:
          h(x) = x % 10000 <-- converts to a 4 digit index
          h(x) = multiply all non-zero digits of x % 10000
- PROBLEM -- Multiple objects can hash to the same slot/index
              -- Clash/collision
    * Hash table array has to be sufficiently large (Sparsely populated)
    * Hash function should do a good job distributing items in the table
