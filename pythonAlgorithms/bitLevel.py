import time
import math



def perfectNum6():
    p = 2
    pPrime = isPrime(p)
    if (pPrime):
        Mp = 1
        for i in range(p - 1):
            Mp = (Mp << 1) | 1
        MpPrime = isPrime(Mp)
    if pPrime & MpPrime:
        mult = 1 << (p - 1)
        perfect = Mp * mult
        return perfect

def isPrime(p):
    prime = True
    for i in range(2, int(math.sqrt(p))+1):
        if p % i == 0:
            prime = False
            break
    return prime

def LucasLehmer(p, m):
    s = 4
    for i in range(p-2):
        s = ((s * s) - 2) % m
    return s == 0

def perfectNumbers():
    start = time.perf_counter_ns()
    perfect = perfectNum6()
    end = time.perf_counter_ns()
    count = 1
    #print(perfect)
    print(count, ":", end - start)
    #print(end - start)
    for p in range(2,70000):
        pPrime = isPrime(p)
        if (pPrime):
            Mp = 1
            for i in range(p - 1):
                Mp = (Mp << 1) | 1
            MpPrime = LucasLehmer(p, Mp)
        if pPrime & MpPrime:
            count += 1
            mult = 1 << (p - 1)
            perfect = Mp * mult
            if count >= 17:
                diff = (time.perf_counter_ns() - end)/1000000000
                if diff < 60:
                    print("last number found", round(diff,2), "seconds ago")
                else:
                    print("last number found", round(diff/60,2), "minutes ago")

            end = time.perf_counter_ns()
            elapsed = end - start
            #print(perfect)
            #print(count, ":", perfect)
            print(count, ":", elapsed)
            #print(elapsed)
        if time.perf_counter_ns() - end > 600000000000:
            print("It has been 10 minutes since the last perfect number was found")
            break
        if count == 40:
            break


#perfectNumbers()
#
# p = 2
# Mp= 1
#
#
# mult = 1<<(p-1)
#
# for i in range(p-1):
#     Mp = (Mp << 1) | 1
#
# print("Mp:",Mp)
# print("mult:", mult)
# print("perfect:", Mp*mult)







