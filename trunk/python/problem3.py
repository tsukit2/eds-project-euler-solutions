# The prime factors of 13195 are 5, 7, 13 and 29.
# 
# What is the largest prime factor of the number 600851475143 ?

from common import prime_values

given_number = 600851475143
biggest_prime = None

for p in prime_values():
   if p > given_number:
      break
   if given_number % p == 0:
      biggest_prime = p
      given_number /= biggest_prime

print(biggest_prime)
