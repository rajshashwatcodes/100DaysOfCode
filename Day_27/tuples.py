inventory = []

# Function to add a product to the inventory
def add_product(product_name, price):
    product = (product_name, price)
    inventory.append(product)

# Function to display all products in the inventory
def display_inventory():
    print("Inventory:")
    for product_name, price in inventory:
        print(f"Product Name: {product_name}")
        print(f"Price: ${price:.2f}")
        print()

while True:
    print("Inventory Management Menu:")
    print("1. Add Product")
    print("2. Display Inventory")
    print("3. Quit")
    choice = input("Enter your choice (1/2/3): ")

    if choice == "1":
        product_name = input("Enter product name: ")
        price = float(input("Enter product price: "))
        add_product(product_name, price)
    elif choice == "2":
        display_inventory()
    elif choice == "3":
        print("Goodbye!")
        break
    else:
        print("Invalid choice. Please select 1, 2, or 3.")
