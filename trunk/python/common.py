
def fib_values():
   "function to produce infinite fibonacci serie"
   a, b = 0,1
   while True:
      yield a + b
      a, b = b, a+b


def prime_values():
   "function to produce infinite prime values"

# initial setup. We know that 2 is prim so use it as the base case
   previous_primes = []
   current_number = 2

# this is the part loop forever
   while True:
      yield current_number
      previous_primes.append(current_number)

      found_it = False
      while not found_it:
         current_number += 1
         for p in previous_primes:
            if current_number % p == 0:
               break
         else:
            found_it = True



   
