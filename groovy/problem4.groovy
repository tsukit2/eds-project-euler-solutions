/*
A palindromic number reads the same both ways. The largest palindrome made from
the product of two 2-digit numbers is 9009 = 91 x 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

def range = 100..<1000
def palindrom = 0
range.each { a ->
   range.each { b ->
      def val = a * b
      def valstr = val.toString()
      if (valstr == valstr.reverse() && val > palindrom) {
         palindrom = val
      }
   }
}
println palindrom


