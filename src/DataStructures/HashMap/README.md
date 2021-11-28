## HashMap Simplified
- Creates and stores key representation of data
### How it works
- A created hashmap positions arial buckets of nodes (linked lists) with size = 16
### Methods:
#### Put():
- The nodes contain (store):
  - key
  - hashcode
  - value
  - next (holds the address of the next nodes)
- Handling Coalition
  - the 'next' attribute of a node points to next value with the same hashcode, instead of creating a new node at the next index
  - adds values in a map
  - calculates the hashcode (```index = hash & (n - 1)```) for the key
    - to help store the key in a specific index within the map
    - facilitates faster retrieval of values
#### Get():
  - fetching(getting) values from a map
#### KetSet():
  - gives you all the keys from a map
  - Entry: interface () in map interface
#### entrySet(): give you the set of entries (key value pairs) in a map
### HashMap vs HashTable

HashMap | HashTable | HashTable
--- | --- | ---
No thread safe. Unsynchronized. | Thread safe. Synchronized
Fast | Slow
Works with single thread | Works with multiple threads
Allows one null key | Does not allow null keys
. | . | Supports the ordering inserting items 