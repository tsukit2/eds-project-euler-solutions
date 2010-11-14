{-
If we list all the natural numbers below 10 that are multiples of 3
or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
-}
import Commons

main = printval $ sum [x | x <- [0..pred 1000], any (==0) [x `mod` 3, x `mod` 5]]
