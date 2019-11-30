# Perfect Number Lab
This lab introduces a set of algorithms programmed in Python and Java to compute perfect numbers. The goal was to produce as many numbers as possible in the shortest time. A perfect number has the property that it is equal to the sum of all its proper divisors. For example:

| *n* | Proper Divisors | Sum of Proper Divisors |
| ---: | :--- | ---: |
| 6 | 1, 2, 3 | 6 |
| 28 | 1, 2, 4, 7, 14 | 28 |
| 496 | 1, 2, 4, 8, 16, 31, 62, 124, 248 | 496 |
| 8128 | 1, 2, 4, 8, 16, 32, 64, 127, 254, 508, 1016, 2032, 4064 | 8128 |
| 33550336 | 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8191, 16382, 32764, 65528, 131056, 262112, 524224, 1048448, 2096896, 4193792, 8387584, 16775168| 33550336 |

Perfect numbers become increasingly hard to find as they quickly gain enormous size. Only 51 perfect numbers have been computed with the most recent being found in 2018 with 49,724,095 digits. The basic algorithm to produce perfect numbers was found to be highly inefficient. Due to this, additional properties of perfect numbers and interesting techniques were tested to attempt at improving the basic algorithm.

## Algorithms
1. **Basic Algorithm:** Find all proper divisors of *n* and sum them. If the sum = *n*, then *n* is a perfect number.

2. **Mersenne Property (Method 2):** If *n* is prime, and then if the Mersenne number 2<sup>*n*</sup> - 1 is prime, then (2<sup>*n*</sup> - 1)(2<sup>*n* - 1</sup>) is a perfect number. To determine if *n* and 2<sup>*n*</sup> - 1 are prime, a basic primality test is used.

3. **Lucas-Lehmer Primality Test:** If *n* is prime, and then if the Mersenne number 2<sup>*n*</sup> - 1 is prime, then (2<sup>*n*</sup> - 1)(2<sup>*n* - 1</sup>) is a perfect number. To determine if *n* is prime, a basic primality test is used. To determine if 2<sup>*n*</sup> - 1 is prime, use an esoteric mathematical theorem on divisibility: The Lucas-Lehmer Test.

4. **Multi-Threading:** Implement multi-threading on top of the Lucas-Lehmer approach.

5. **Delete Redundancy:** Generate a list of prime numbers before initiating the Lucas-Lehmer method to avoid unnecessary computations.

6. **Bit Level:** For a given prime *p*, the Mersenne number 2<sup>*p*</sup> - 1 takes the binary form: 111...111, a sequence of *p* 1's. Additionally, the multiplier 2<sup>*p* - 1</sup> takes the binary form: 100...000, a 1 followed by *p* - 1 0's. Construct these numbers by setting and clearing bits instead of computing exponentials.
