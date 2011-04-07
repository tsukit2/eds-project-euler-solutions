# A palindromic number reads the same both ways. The largest palindrome made from
# the product of two 2-digit numbers is 9009 = 91 x 99.
# 
# Find the largest palindrome made from the product of two 3-digit numbers.

#def is_palindromic(num):
#   num_str = str(num)
#   i, j = 0, len(num_str) - 1
#   while i <= j:
#      if (num_str[i] != num_str[j]):
#         return False
#      i += 1
#      j -= 1 

# if reach here, it's palindromic
   return True

num_range = range(100, 1000)
largest_palindrom = max([n for n in
                           [n1*n2 for n1 in num_range for n2 in num_range] 
                           if str(n) == str(n)[::-1]])
print(largest_palindrom)

