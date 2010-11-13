/*
If we list all the natural numbers below 10 that are multiples of 3
or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
println ((0..<1000).inject(0) { a,b -> 
   (b % 3 == 0 || b % 5 == 0) ? a+b : a 
   })
