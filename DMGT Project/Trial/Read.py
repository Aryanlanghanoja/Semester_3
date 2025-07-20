import pandas as pd

excel_file_path = 'Nodes.xlsx'  # Replace with the path to your Excel file
df = pd.read_excel(excel_file_path)

# Extract the first column and store it in a Python list
first_column = df.iloc[:, 0].tolist()

print(first_column)
