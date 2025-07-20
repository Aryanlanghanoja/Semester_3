import tkinter as tk
from tkinter import messagebox
# Initialize variables
current_player = "X"
board = [""] * 9
# Create the main game window
window = tk.Tk()
window.title("Tic-Tac-Toe")
# Function to handle button clicks
def button_click(index):
    global current_player
    if board[index] == "":
        board[index] = current_player
        buttons[index].config(text=current_player)
        if check_winner(current_player):
            messagebox.showinfo("Tic-Tac-Toe", f"Player {current_player} wins!")
            reset_game()
        elif "" not in board:
            messagebox.showinfo("Tic-Tac-Toe", "It's a draw!")
            reset_game()
        else:
            current_player = "O" if current_player == "X" else "X 
# Function to check for a winner
def check_winner(player):
    winning_combinations = [
        [0, 1, 2], [3, 4, 5], [6, 7, 8],  # Rows
        [0, 3, 6], [1, 4, 7], [2, 5, 8],  # Columns
        [0, 4, 8], [2, 4, 6]              # Diagonals
    ]
    for combo in winning_combinations:
        if board[combo[0]] == board[combo[1]] == board[combo[2]] == player:
            return True
    return False
# Function to reset the game
def reset_game():
    global board, current_player
    board = [""] * 9
    current_player = "X"
    for button in buttons:
        button.config(text="", state="active")
# Create buttons for the game board
buttons = []
for i in range(9):
    row = i // 3
    col = i % 3
    button = tk.Button(window, text="", width=10, height=3,
                       command=lambda i=i: button_click(i))
    button.grid(row=row, column=col)
    buttons.append(button)
# Start the game
window.mainloop()
