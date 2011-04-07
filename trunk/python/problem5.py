# 2520 is the smallest number that can be divided by each of the numbers from 1
# to 10 without any remainder.
# 
# What is the smallest positive number that is evenly divisible by all of the
# numbers from 1 to 20?

# The solution uses the table method explained here:
# http://en.wikipedia.org/wiki/Least_common_multiple

import common
import functools

MAX = 20
elems = []
comps = list(range(1,MAX+1))
comps_len = len(comps)
prims = common.prime_values()

# check that all components are all 1
def all_are_1(L):
   for n in L:
      if n != 1: return False
   return True

# loop as long as not all components are all 1
while not all_are_1(comps):
# get the next prime number
   p = next(prims)
   added = True

# as long as the prime divide some value, continue to use it
   while added:
      added = False
      for i in range(0, comps_len):
         n = comps[i]
# if the prime divides, put the result into table. Otherwise leave it be
# also if the prime hasn't been added, add it now we can use in calculating
# the result later
         if n % p == 0:
            comps[i] = n / p
            if not added: 
               elems.append(p)
               added = True

# reach here, we just multiply all the elements together to get the answer
answer = functools.reduce(lambda x,y: x*y, elems)
print(answer)
   
