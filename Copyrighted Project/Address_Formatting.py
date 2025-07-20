# Import the pandas library for data manipulation and analysis
import pandas as pd

# Read the source dataset from the specified Excel file and sheet
Source_Dataset = pd.read_excel(
    "D:/Aryan Data/Usefull Data/Semester - 3/Copyrighted Project/Dataset.xlsx",
    "New Dataset",
)

# Extract unique source and destination stations from the source dataset
Unique_Source_Stations = set(Source_Dataset["Source"])
Unique_Destination_Stations = set(Source_Dataset["Destination"])

# Create a set of unique stations by combining source and destination stations
Unique_Stations = list(Unique_Source_Stations.union(Unique_Destination_Stations))

# Create a new DataFrame with a single column 'Station Name' containing unique stations
DataFrame = pd.DataFrame({"Station Name": Unique_Stations})

# Specify the path for the output Excel file containing unique stations
Output_Path = (
    "D:/Aryan Data/Usefull Data/Semester - 3/Copyrighted Project/Unique Stations.xlsx"
)

# Save the DataFrame to the specified Excel file, excluding the index column
DataFrame.to_excel(Output_Path, index=False)

# Print a success message indicating the completion of the operation
print(f"Successfully saved the station names to {Output_Path}")

# If you want to fill NaN values in the 'Station Name' column with a specific value (e.g., 'Not Available'),
# you can use the following line:
# Destination_Dataset['Station Name'] = Destination_Dataset['Station Name'].fillna('Not Available')
