package Java.JavaLearnings.PART1.DiamondProblem;

import java.util.*;
public class classD extends classA{
    // first of all here you won't be able to extend Both the classes becuase java throws the syntax error
    // Lets imagine someshow you extended both the classes then in that case if you try to call the show method
    // there will be ambiguity that which show method to be called either of class B, or class C
    // Hence java does not allow multile inheritence and throws compile time error
}