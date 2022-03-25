# Java_FunctionalPgms<br>

#                                                   Functional Programs<br>

# 1. 2D Array<br>
a. Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
standard input and printing them out to standard output.<br>
b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class<br>
c. Logic -> create 2 dimensional array in memory to read in M rows and N cols<br>
d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
OutputStreamWriter to print the output to the screen.<br>

# 2. Sum of three Integer adds to ZERO<br>
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.<br>
b. I/P -> N number of integer, and N integer input array<br>
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0<br>
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.<br>


# 3. Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function<br>

# 4. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.<br>
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula (Note: Take a, b and c as input values)<br>
delta = b*b - 4*a*c<br>
Root 1 of x = (-b + sqrt(delta))/(2*a)<br>
Root 2 of x = (-b - sqrt(delta))/(2*a)<br>

# 5. Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be:<br>

# Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger
than 120 or less than 3 (you may assume that the values you get are in that range).
