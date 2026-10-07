# Solution note: Floating-point precision

## Problem

Add `0.1` ten times and check whether the result is exactly `1.0`.

## Constraints and assumptions

`double` is used because the exercise works with fractional values.

Floating-point numbers are approximations. Some decimal values, such as `0.1`, cannot be represented exactly in binary.

## Chosen approach and trade-off

Use `double` for the calculation.

The trade-off is that the result may contain a small rounding error because some decimal values cannot be represented
exactly in binary.

An alternative is to represent the values as integer tenths, avoiding this rounding error when the values have a fixed
decimal precision. Another option is `BigDecimal`, which provides decimal arithmetic with explicit precision.

`double` is the wrong choice when exact decimal values are required, such as financial calculations. It is appropriate
for many physical measurements, where small approximation errors are inherent to the measurement itself.

## Correctness

The result is expected for floating-point arithmetic. The issue is not the addition itself, but the fact that `0.1` is
stored as an approximation.

In this case, adding `0.1` ten times produces `0.9999999999999999` instead of exactly `1.0`.

Therefore, `sumOfTenths == 1.0` evaluates to `false`.

The multiplication `0.1 * 10` produces exactly `1.0` in this case. The problem is the repeated addition: each operation
can introduce a small rounding error, and those errors can accumulate.

## Cost

The calculation uses constant space and a fixed number of operations.

The relevant cost here is the accumulated rounding error. The actual difference reported by Java is:

`1.0 - 0.9999999999999999 = 1.1102230246251565E-16`

The error is extremely small, but the important issue is that the result is not exact. With more operations, rounding
errors can accumulate.

## What I got wrong first

My intuition expected `1.0` because `0.1 × 10 = 1.0`.

That intuition was correct for the multiplication. What actually failed was the repeated addition, which produced
`0.9999999999999999`.

This showed that the problem is not simply that `0.1` is an approximation. The rounding error from each operation is
very small, but repeated operations can accumulate that error.
