import time
import math

def getMp(p):
    n = 1
    for i in range(p):
        n = 2 * n
    n = n - 1
    return n

def isPrime(p):
    prime = True
    for i in range(2, int(math.sqrt(p))+1):
        if p % i == 0:
            prime = False
            break
    return prime

def getMult(p):
    n = 1
    for i in range(p - 1):
        n = 2 * n
    return n

def perfectNumbers():
    count = 0
    start = time.perf_counter_ns()
    for p in range(2,70000):
        pPrime = isPrime(p)
        if pPrime:
            Mp = getMp(p)
            MpPrime = isPrime(Mp)
        if pPrime & MpPrime:
            count += 1
            mult = getMult(p)
            perfect = Mp * mult
            end = time.perf_counter_ns()
            #print(perfect)
            #print(end - start)
            print(perfect, ":", end - start)
        if count == 12:
            break

perfectNumbers()
