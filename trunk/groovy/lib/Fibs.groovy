// Fibonacci sequence
class Fibs extends InfiniteSequence {

   protected copyStates(prevStates) {
      prevStates?.clone() ?: [a:1, b:1]
   }

   protected next(states) {
      def (a,b) = [states.b, states.a+states.b]; 
      states.a = a; states.b = b
      return a
   }
}
