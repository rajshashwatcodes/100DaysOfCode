address_book = {}

# Function to add a new contact to the address book
def add_contact(name, phone_number, email):
    contact = {
        "Phone Number": phone_number,
        "Email": email
    }
    address_book[name] = contact

# Function to display all contacts in the address book
def display_contacts():
    print("Address Book:")
    for name, contact in address_book.items():
        print(f"Name: {name}")
        print(f"Phone Number: {contact['Phone Number']}")
        print(f"Email: {contact['Email']}")
        print()

while True:
    print("Address Book Menu:")
    print("1. Add Contact")
    print("2. Display Contacts")
    print("3. Quit")
    choice = input("Enter your choice (1/2/3): ")

    if choice == "1":
        name = input("Enter name: ")
        phone_number = input("Enter phone number: ")
        email = input("Enter email: ")
        add_contact(name, phone_number, email)
    elif choice == "2":
        display_contacts()
    elif choice == "3":
        print("Goodbye!")
        break
    else:
        print("Invalid choice. Please select 1, 2, or 3.")
