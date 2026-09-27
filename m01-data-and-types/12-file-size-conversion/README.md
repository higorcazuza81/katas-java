# Solution note: File size conversion

## Problem

Given a file size in bytes, report the equivalent in kilobytes, megabytes,
and gigabytes.

## Constraints and assumptions

Sizes go up to several gigabytes. 1 KB = 1024 bytes (binary convention, not
the decimal 1000 used by storage manufacturers).

## Options considered

- int for the byte count: rejected. A file above roughly 2 GB already
  exceeds Integer.MAX_VALUE in bytes, before any division happens.
- double for the byte count: rejected. Byte counts are always whole
  numbers; a floating type adds precision risk for a value that never
  has a fractional part.

## Chosen approach and trade-off

long for every quantity, from the raw byte count down to the converted
values. Cost: eight bytes per variable instead of four, irrelevant here.
Gain: correctness at any realistic file size, with no silent overflow.

## Correctness

Verified against 5,368,709,120 bytes, an exact multiple of 1024 at every
level, resulting in 5,242,880 KB, 5,120 MB, 5 GB. Still to check: a byte
count that is not an exact multiple, to see how integer division truncates.

## Cost

Constant time and space regardless of the byte count.

## What I got wrong first

Nothing wrong on the first attempt; long was chosen correctly from the start.