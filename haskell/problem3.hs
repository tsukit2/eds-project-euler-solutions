{-
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
-}
import Commons

main = printval $ largestPrimeFactor 600851475143 (head primes) (tail primes)
   where largestPrimeFactor val ans (p:primes) = if (p > val) 
                                                   then ans
                                                   else if (val `mod` p == 0)
                                                      then largestPrimeFactor (val `div` p) p primes
                                                      else largestPrimeFactor val ans primes



