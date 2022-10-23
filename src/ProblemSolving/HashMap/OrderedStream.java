package ProblemSolving.HashMap;

/***
 * There is a stream of n (idKey, value) pairs arriving in an arbitrary order,
 * where idKey is an integer between 1 and n and value is a string.
 * No two pairs have the same id.
 *
 * Design a stream that returns the values in increasing order of their IDs by
 * returning a chunk (list) of values after each insertion.
 * The concatenation of all the chunks should result in a list of the sorted values.
 *
 * Implement the OrderedStream class:
 *
 * OrderedStream(int n) Constructs the stream to take n values.
 * DataStructures.String[] insert(int idKey, DataStructures.String value) Inserts the pair (idKey, value)
 * into the stream, then returns the largest possible chunk of currently inserted
 * values that appear next in the order.
 *
 * https://leetcode.com/problems/design-an-ordered-stream/
 */
public class OrderedStream {
    public static void main(String[] args) {
        System.out.println();
    }

    /**
     * Your OrderedStream object will be instantiated and called as such:
     * OrderedStream obj = new OrderedStream(n);
     * List<DataStructures.String> param_1 = obj.insert(idKey,value);
     */
    OrderedStream(int n) {
        System.out.println(n);
    }
}
