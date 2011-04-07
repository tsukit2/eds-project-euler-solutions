/*
2520 is the smallest number that can be divided by each of the numbers from 1
to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the
numbers from 1 to 20?

The solution uses the table method explained here:
http://en.wikipedia.org/wiki/Least_common_multiple
*/

def MAX = 20
def elems = []
def comps = new ArrayList<Integer>(1..MAX)
def primes = new Primes().iterator()

while(comps.any { it != 1 }) {
   int p = primes.next()
   def added = true
   while(added) {
      added = false
      MAX.times { i ->
         int n = comps[i]
         if (n % p == 0) {
            comps[i] = n / p
            if(!added) {
               elems << p
               added = true
            }
         }
      }
   }
}

def answer = elems.inject(1) { x, y -> x * y }
println answer



