import time

def perfectNumbers():
    start = time.perf_counter_ns()
    for p in range(2, 100000000):
        sum = 0
        for i in range(1, int((p/2)+1)):
            if p % i == 0:
                sum += i
        if sum == p:
            end = time.perf_counter_ns()
            print(p, ":", end - start)
            #print(p)



perfectNumbers()



