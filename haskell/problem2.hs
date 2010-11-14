{-
Each new term in the Fibonacci sequence is generated by adding the
previous two terms. By starting with 1 and 2, the first 10 terms
will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Find the sum of all the even-valued terms in the sequence which do
not exceed four million.def limit = 4 * 10**6
-}
import Commons

main = printval $ sum $ takeWhile (< 4*10^6) [x | x <- fibs, even x]
