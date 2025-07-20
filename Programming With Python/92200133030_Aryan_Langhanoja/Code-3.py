import numpy as np
array = np.array([[3, 7, 1], [10, 3, 2], [5, 6, 7]])

flatten_array = array.flatten()
whole_sort = np.sort(flatten_array)

row_sort = np.sort(array, axis=1)

column_sort = np.sort(array, axis=0)

print(f"Input Array :-\n{array}\nSorted Array Along Whole Array :- \n{whole_sort}\nSorted Array Along Each Row :- \n{row_sort}\nSorted Array Along Each Column :- \n{column_sort}")
