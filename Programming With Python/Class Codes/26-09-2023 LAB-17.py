# # Task - 1 :- Creating a Series by passing a list of values, letting pandas create a default RangeIndex.

# import numpy as np
# import pandas as pd

# s = pd.Series([1, 3, 5, np.nan, 6, 8])
# print(s)

# # Task - 2 :- Creating a DataFrame by passing a NumPy array with a datetime index using date_range() and labeled columns

# import numpy as np
# import pandas as pd
# dates = pd.date_range("20130101", periods=6)
# df = pd.DataFrame(np.random.randn(6, 4), index=dates, columns=list("ABCD"))
# print(df)

# # Task - 3 :- Creating a DataFrame by passing a dictionary of objects where the keys are the column labels and the values are the column values.

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2)

# # Task - 3 :- Checking The DataTypes of Each Column In Dataframe.

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.dtypes)

# # Task - 4 :- Implement head Function

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.head())

# # Task - 5 :- Implement tail Function

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.tail(3))

# # Task - 6 :- Implement index Function

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.index)

# # Task - 7 :- Implement columns Function

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.columns)

# # Task - 8 :- Converting DAtaframe into Numpy Array

# import numpy as np
# import pandas as pd
# df2 = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df2.to_numpy())

# # Task - 9 :- Implemnting describe() Function

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df.describe())

# # Task - 10 :- Sorting Dataframe by index

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df.sort_index(axis=1, ascending=False))

# # Task - 11 :- Sorting Dataframe by Value

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df.sort_values(by="B"))

# # Task - 12 :- Creating a Pandas DataFrame with Mixed Data Types and Accessing a Column

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df["A"])

# # Task - 13 :- Creating a Pandas DataFrame with Mixed Data Types and Slicing

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df[0:3])

# # Task - 14 :- Creating a Pandas DataFrame with Mixed Data Types and Selecting Rows and Columns

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df.loc["20130102":"20130104", ["A", "B"]])

# # Task - 15 :- Creating a Pandas DataFrame with Various Data Types and Selecting a Row

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df.iloc[3])

# # Task - 16 :- Creating and Filtering a Pandas DataFrame with Mixed Data Types

# import numpy as np
# import pandas as pd
# df = pd.DataFrame(
#     {
#         "A": 1.0,
#         "B": pd.Timestamp("20130102"),
#         "C": pd.Series(1, index=list(range(4)), dtype="float32"),
#         "D": np.array([3] * 4, dtype="int32"),
#         "E": pd.Categorical(["test", "train", "test", "train"]),
#         "F": "foo",
#     }
# )

# print(df[df["A"] > 0])







