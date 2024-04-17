user_input = input("Enter a string: ")

# recursion
reverse = user_input[::-1]

if user_input == reverse:
    print(user_input + " is a palindrome")
else:
    print(user_input + " is not a palindrome")