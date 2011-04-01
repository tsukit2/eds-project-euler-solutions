
def fib_values():
   "function to produce infinite fibonacci serie"
   a, b = 0,1
   while True:
      yield a + b
      a, b = b, a+b


