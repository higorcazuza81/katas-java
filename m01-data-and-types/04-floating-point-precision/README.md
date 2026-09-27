# Solution note: Floating-point precision

## Problem

Add `0.1` ten times and check whether the result is exactly `1.0`.

## Constraints and assumptions

`double` is used because the exercise works with fractional values.

Floating-point numbers are approximations. Some decimal values, such as
`0.1`, cannot be represented exactly in binary.

## Chosen approach and trade-off

Use `double` for the calculation.

The trade-off is that the result may contain a small rounding error. In this
case, adding `0.1` ten times produces `0.9999999999999999` instead of exactly
`1.0`.

Therefore, `b == 1.0` evaluates to `false`.

## Correctness

The result is expected for floating-point arithmetic. The issue is not the
addition itself, but the fact that `0.1` is stored as an approximation.

## Cost

Constant time and space.

## What I got wrong first

My intuition expected `1.0` because `0.1 × 10 = 1.0`.

What actually happened was `0.9999999999999999`, showing that the decimal
value `0.1` is not represented exactly by `double`.
