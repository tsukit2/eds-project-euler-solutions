// base class for all infinite sequence so we don't have to repeat
// unnecessary methods
abstract class InfiniteSequence implements Iterator {
   void remove() { throw new UnsupportedOperationException() }
   boolean hasNext() { true }
}

