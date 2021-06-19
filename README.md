# test-2

Jade love uniqueness. Every time he found a string, he makes that string into multiple unique character strings. But Jade has a rule to make a new string, you can only remove the duplicate character, and cannot change the arrangement of the characters. Jade also sort the possibilities of the string in lexicographic order.

We consider lexicographic order of characters as their order of ASCII value. Hence the lexicographical order of character will be 'a', 'b', 'c', ..., 'y', 'z'. 


For example:
string "sebaerb"

Possible arragements:
- saerb -> the first in lexicographical order
- sbaer -> the 2nd in lexicographical order
- searb -> the 3rd in lexicographical order
- sebar -> the first occurence from left to right, the last in lexicographical order
