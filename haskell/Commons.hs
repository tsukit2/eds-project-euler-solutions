module Commons where

printval :: (Show a) => a -> IO()
printval = putStrLn . show

fibs = 1 : 2 : zipWith (+) fibs (tail fibs)

primes = 2 : nextPrime (base + 1)
   where base = head primes
         nextPrime candidate = 
            if any (\f -> candidate `mod` f == 0) filters
               then nextPrime (candidate + 1)
               else candidate : nextPrime (candidate + 1)
            where filters = takeWhile (<= candidate `div` 2) primes

