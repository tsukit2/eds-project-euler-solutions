// Primes sequence
class Primes extends InfiniteSequence {
   private filters = []
   private current = 2
   def next() { 
      def nextPrime = current
      filters << current++
      while(filters.any { current % it == 0 })
         ++current
      return nextPrime
   }
}
