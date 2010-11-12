/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
*/
def target = 600851475143
def answer
for (n in new Primes()) {
   if (n > target) break
   if (target % n == 0) {
      answer = n
      target = target / n as BigInteger
   }
}

println answer
