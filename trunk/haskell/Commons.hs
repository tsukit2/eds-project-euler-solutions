module Commons where

fibs = 1 : 2 : zipWith (+) fibs (tail fibs)


