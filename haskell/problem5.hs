{-
2520 is the smallest number that can be divided by each of the numbers from 1
to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?

The solution uses the table method explained here:
http://en.wikipedia.org/wiki/Least_common_multiple
-}

import Commons

max_value = 20

main = printval answer
   where answer = foldl (*) 1 elems
         elems = findElements [] [1..max_value] primes


-- each of the level within this function represents different loops that are usually
-- there in imperative programming
findElements elems table primes = 
   -- the most outter loop check if all elements are reduced to 1. If not, keep looping
   if any (/= 1) table' 
      then findElements elems' table' (tail primes)
      else elems'
   where
      -- this second inner loop reduce the elements in the table and add the prime
      -- number into the elems'
      (elems', table') =  factorThem elems table (head primes)
      factorThem es ts p = 
         if any (==True) divs 
            then factorThem (p:es) ts' p 
            else (es, ts)
         where (ts',divs) = foldl tryFactoring ([], []) ts
               tryFactoring (rs, divs) v = 
                  if v `mod` p == 0 then (v `div` p : rs, True:divs) 
                                    else (v:rs, False:divs)





