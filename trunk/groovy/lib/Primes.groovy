// Primes sequence
class Primes extends InfiniteSequence {

   protected copyStates(prevStates) {
      prevStates?.clone() ?: [filters:[], current:2]
   }

   protected next(states) {
      def nextPrime = states.current
      states.filters << states.current
      def foundIt = false
      while(!foundIt) {
         // move to the next number and assume it's a prime
         ++states.current
         foundIt = true

         // apply the filter that's lower than half it
         def limit = states.current / 2 as BigInteger
         for (f in states.filters) {
            if (f > limit) break
            if (states.current % f == 0) {
               foundIt = false
            }
         }
      }
      return nextPrime
   }
}
