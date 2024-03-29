# Each new term in the Fibonacci sequence is generated by adding the
# previous two terms. By starting with 1 and 2, the first 10 terms
# will be:
# 
# 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
# 
# Find the sum of all the even-valued terms in the sequence which do
# not exceed four million.def limit = 4 * 10**6

from common import fib_values
from itertools import takewhile

limit = 4 * 10**6
fibs_under_limit = takewhile(lambda x: x <= limit, fib_values())
print(sum([n for n in fibs_under_limit if n % 2 == 0]))
