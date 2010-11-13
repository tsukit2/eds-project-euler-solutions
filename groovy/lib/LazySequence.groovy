// base class for all lazy sequence so we don't have to repeat
// unnecessary methods
abstract class LazySequence implements Iterable {
   protected states

   protected abstract copyStates(prevStates)
   protected abstract boolean hasNext(states)
   protected abstract next(states)

   Iterator iterator() { 
      new LazySequenceIterator(copyStates(states))
   }

   private class LazySequenceIterator implements Iterator {
      private copiedStates
      LazySequenceIterator(states) { this.copiedStates = states }
      void remove() { throw new UnsupportedOperationException() }
      boolean hasNext() { hasNext(copiedStates) }
      Object next() { next(copiedStates) }
   }
}

