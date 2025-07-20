# # Task - 1 Writing in File

# import _mysql_connector
# import os as o
# f = open('92200133030.txt', 'w')
# f.write('1) Programming With Python\n')
# f.write('2) Computer Organization And Architecture\n')
# f.write('3) Introduction To Communication Enginnering\n')
# f.write('4) Discrete Mathematics and Graph Theory\n')
# f.write('5) Signals and Systems\n')
# f.write('6) Data Structures Using C++\n')
# f.close()

# # Task - 2 Append The Text In File

# import _mysql_connector
# import os as o
# f = open('92200133030.txt', 'a')
# f.write('7) Stock Market For Beginners\n')
# f.close()

# # Task - 3

# import _mysql_connector
# import os as o
# f = open('92200133030.txt', 'r')
# # print(f.readline())  # Read First Line
# print(f.readlines())  # Read All Next Lines
# # print(f.read())  # Read Entire File
# # print(f.readline())  # ReturnEmpty String After EOF

# # Task - 4 :- Exception Handling in File

# import _mysql_connector
# import os as o
# try:
#     f = open('92200133030.txt', 'r')
#     print(f.read())

# finally:
#     f.close()

# # Task - 5 Processing (With Statement Is Equivalent to the try-finally Statement)

# import _mysql_connector
# import os as o
# with open('92200133030.txt', 'r') as f:
#     for line in f:
#         line = line.strip()
#         print(line)

# Task - 6 Deleting File

# import _mysql_connector
# import os as o
# o.remove('92200133030.txt')


# # Post Lab

# # Task - 1
# import _mysql_connector
# import os as o
# # Crating Binary File
# with open('Binary File.bin', 'wb') as file:
#     Binary_Data = bytes([13, 12, 54, 32])
#     file.write(Binary_Data)


# # Read Binary File

# with open('Binary File.bin', 'rb') as file:
#     data = file.read()
#     print(f"Binary Data :- {data}")


# # Task - 2

# import _mysql_connector
# import os as o

# try:
#     with open("LOG.DAT", "wb") as file:

#         print("File opened in write mode.")

#         if file.writable():
#             print("The file is writable.")
#         else:
#             print("The file is not writable.")

# except PermissionError:
#     print("Permission denied.")


# try:
#     with open("LOG.DAT", "rb") as file:

#         print("File opened in read mode.")

#         if file.readable():
#             print("The file is readable.")
#         else:
#             print("The file is not readable.")

# except FileNotFoundError:
#     print("File not found.")


# with open("output.txt", "w") as file:
#     lines = ["Line 1\n", "Line 2\n", "Line 3\n"]
#     file.writelines(lines)

# # Task - 3
# import _mysql_connector
# import os as o

# f = open('92200133030.txt', 'w')
# f.write('1) Programming With Python\n')
# f.write('2) Computer Organization And Architecture\n')
# f.write('3) Introduction To Communication Enginnering\n')
# f.write('4) Discrete Mathematics and Graph Theory\n')
# f.write('5) Signals and Systems\n')
# f.write('6) Data Structures Using C++\n')
# f.write('7) Stock Market For Beginners\n')

# g = open('92200133030(1).txt', 'w')
# data = f.read()
# g.write(data)
# print(g.read())

# f.close()
# g.close()

# Task - 4

def is_string_present_in_file(file_path, search_string):
    try:
        with open(file_path, 'r') as file:
            file_contents = file.read()
            if search_string in file_contents:
                return True
            else:
                return False
    except FileNotFoundError:
        print("File not found")
    except Exception as e:
        print("An error occurred:", str(e))
    return False

file_path = '92200133030.txt'  
search_string = 'Programming With Python'


if is_string_present_in_file(file_path, search_string):
    print(f"The string '{search_string}' is present in the file.")
else:
    print(f"The string '{search_string}' is not present in the file.")
