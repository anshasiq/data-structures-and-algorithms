1. `Insert` Function:
    - This function takes two arguments: an array `sorted` (which is assumed to be already sorted in ascending order) and an integer `value` to be inserted into the sorted array.

    - `int i = 0;` initializes a variable `i` to zero. This variable will be used to traverse the `sorted` array.

    - `while (i < sorted.length && value > sorted[i])` is a loop that iterates while `i` is within the bounds of the `sorted` array and `value` is greater than the element at the current position in `sorted`. This loop is used to find the correct position for `value` in the sorted array.

    - Inside the loop:
        - `int temp = sorted[i];` stores the current element of `sorted[i]` in a temporary variable `temp`.
        - `sorted[i] = value;` replaces the element at index `i` with `value`.
        - `value = temp;` sets `value` to the value of the `temp` variable.
        - `i++;` increments `i` to move to the next element in `sorted`.

    - After the loop, the final step is to append the `value` to the end of the sorted array: `sorted[sorted.length - 1] = value;`.

2. `InsertionSort` Function:
    - This function takes an input array `input` and is responsible for sorting it using the `Insert` function.

    - `int[] sorted = new int[input.length];` initializes an empty integer array `sorted` with the same length as the `input` array. This array will be used to store the sorted elements.

    - `sorted[0] = input[0];` initializes the `sorted` array with the first element from the `input` array since an array with one element is considered sorted.

    - The `for` loop `for (int i = 1; i < input.length; i++)` starts from the second element of the `input` array (index 1) and iterates through the array.

    - Inside the loop, `Insert(sorted, input[i]);` calls the `Insert` function to insert the current element `input[i]` into the `sorted` array.

    - Finally, the function returns the `sorted` array, which contains the sorted elements.

3. `main` Method:
    - The `main` method demonstrates how to use the `InsertionSort` function.
    - It creates an array `input` with unsorted integers.
    - It calls `InsertionSort(input)` to sort the array.
    - It then prints the sorted array to the console.

When you run the code, it will sort the `input` array using the insertion sort algorithm and print the sorted array to the console.
