// Primes sequence
class Primes extends InfiniteSequence {

   protected copyStates(prevStates) {
      prevStates?.clone() ?: [filters:[], current:2]
   }

   protected next(states) {
      def nextPrime = states.current
      states.filters << states.current++
      while(states.filters.any { states.current % it == 0 })
         ++states.current
      return nextPrime
   }
}
