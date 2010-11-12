def limit = 4 * 10**6
def sum = 0
for (def f in new Fibs()) {
   if (f > limit) break
   if (f % 2 == 0) sum += f
}

println sum
