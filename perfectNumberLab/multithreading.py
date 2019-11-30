from threading import Thread
import time
import math

count = 0

class perfectNumberThread(Thread):
    def __init__(self, threadID, begin, finish):
        Thread.__init__(self)
        self.threadID = threadID
        self.begin = begin
        self.finish = finish
    def run(self):
        global count
        start = end = diff = 0
        if self.begin == 2:
            start = time.perf_counter_ns()
            perfect = perfectNum6()
            end = time.perf_counter_ns()
            count += 1
            #print(count, ":", end - start)
            #print(perfect)
            print(count, ":", perfect)
            # print(end - start)
        for p in range(self.begin, self.finish):
            pPrime = isPrime(p)
            MpPrime = False
            if (pPrime):
                Mp = (2 ** p) - 1
                MpPrime = LucasLehmer(p, Mp)
            if pPrime & MpPrime:
                count += 1
                mult = (2 ** (p - 1))
                perfect = Mp * mult
                if count >= 17:
                    diff = (time.perf_counter_ns() - end) / 1000000000
                    if diff < 60:
                        print("last number found", round(diff, 2), "seconds ago")
                    else:
                        print("last number found", round(diff / 60, 2), "minutes ago")

                end = time.perf_counter_ns()
                elapsed = end - start
                print(count, ":", perfect)
                #print(count, ":", elapsed)
                #print(perfect)
                # print(elapsed)
            if time.perf_counter_ns() - end > 600000000000:
                print("It has been 10 minutes since the last perfect number was found")
                break
            if count == 21:
                break

def perfectNum6():
    p = 2
    pPrime = isPrime(p)
    if (pPrime):
        Mp = (2**p)-1
        MpPrime = isPrime(Mp)
    if pPrime & MpPrime:
        mult = (2 ** (p - 1))
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

# Thread range 2:
thread1 = perfectNumberThread(1, 2, 1000)
thread2 = perfectNumberThread(2, 1000, 4000)
thread3 = perfectNumberThread(3, 4000, 10000)
thread4 = perfectNumberThread(4, 10000, 25000)


thread1.start()
thread2.start()
thread3.start()
thread4.start()


"""""
# Thread range 1:
thread1 = perfectNumberThread(1, 2, 1000)
thread2 = perfectNumberThread(2, 1000, 3500)
thread3 = perfectNumberThread(3, 3500, 5000)
thread4 = perfectNumberThread(4, 5000, 10000)
thread5 = perfectNumberThread(5, 10000, 11300)
thread6 = perfectNumberThread(6, 11300, 20000)
thread7 = perfectNumberThread(7, 20000, 22000)
thread8 = perfectNumberThread(8, 22000, 24000)

thread1.start()
thread2.start()
thread3.start()
thread4.start()
thread5.start()
thread6.start()
thread7.start()
thread8.start()
"""
