password = input("Enter your password: ")

length = len(password)
has_upper = False
has_lower = False
has_digit = False
has_special = False

special_characters = "!@#$%^&*"

for char in password:
    if char.isupper():
        has_upper = True
    elif char.islower():
        has_lower = True
    elif char.isdigit():
        has_digit = True
    elif char in special_characters:
        has_special = True

score = 0

if length >= 8:
    score = score + 1
if has_upper:
    score = score + 1
if has_lower:
    score = score + 1
if has_digit:
    score = score + 1
if has_special:
    score = score + 1

print("\nPassword Analysis")
print("Length:", length)
print("Has uppercase letter:", has_upper)
print("Has lowercase letter:", has_lower)
print("Has number:", has_digit)
print("Has special character:", has_special)

if score <= 2:
    print("\nPassword Strength: Weak")
elif score <= 4:
    print("\nPassword Strength: Medium")
else:
    print("\nPassword Strength: Strong")
