//Create your own functional interface with a single abstract
//method that accepts an integer and returns a boolean.
//Implement it using a lambda that checks if the number is
//prime.
package lambdaAndStreams.functional;
@FunctionalInterface
public interface Candidate {
    boolean isCandidate(int num);
}
