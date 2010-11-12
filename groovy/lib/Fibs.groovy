// Fibonacci sequence
class Fibs extends InfiniteSequence {
   private a = 1, b = 1
   def next() { (a,b) = [b,a+b]; return a }
}
