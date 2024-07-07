import itertools

# Define the number of digits to generate
num_digits = 4

# Define the range of numbers to choose from
range_of_numbers = range(1, 10)

# Get all possible combinations of the numbers
combinations = itertools.permutations(range_of_numbers, num_digits)

# Loop through each combination and perform basic arithmetic operations on them
results = []
for c in combinations:
    # Addition
    result = c[0] + c[1] + c[2] + c[3]
    results.append(result)

    # Subtraction
    result = c[0] - c[1] - c[2] - c[3]
    results.append(result)

    # Multiplication
    result = c[0] * c[1] * c[2] * c[3]
    results.append(result)

    # Division (if possible)
    if c[1] != 0 and c[2] != 0 and c[3] != 0:
        result = c[0] / c[1] / c[2] / c[3]
        results.append(result)

# Print out the unique results
print(set(results))
