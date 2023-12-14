# House Building Kata

## How to solve the problem
Apply Open close Principle to the solve the problem:
1. with template method
2. by composition

## Problem description
Our building tool is able to build only houses. We need to extend it to be able to build other types of buildings: 
1. skyscraper: is like a house but 
   - always painted in blue
   - when building the foundation, we need to print ```System.out.println(name + ": Building very deep foundation...");```
2. dog house: is like a house but 
   - has no foundation
   - has only one floor
   - when building the pillars, we need to print ```System.out.println(name + ": Building wood pillars...");```
3. bird house: is like a house but
   - has no foundation
   - has no pillars
   - is not painted
   - has only one floor
   - has a bird stand, before build the roof we have to build the stand, we need to print ```System.out.println(name + ": Building bird stand...");```

## Questions
1. What are the problems with the "template method" implementation?
2. What are the problems with the "composition" implementation?

## Author
[Marco Fracassi](https://www.linkedin.com/in/marco-fracassi/)
[Improving Code](https://youtube.com/@improvingcode)
