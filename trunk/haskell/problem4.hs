{-- 
 - A palindromic number reads the same both ways. The largest palindrome made
 - from the product of two 2-digit numbers is 9009 = 91 x 99.  Find the largest
 - palindrome made from the product of two 3-digit numbers.  
 - --}

import Commons

main = printval largest_palindrom
   where largest_palindrom = maximum palindroms
         palindroms = [n*m | n <- range, m <- range, 
                             show (n*m) == reverse (show (n*m))]
         range = [100..999]

