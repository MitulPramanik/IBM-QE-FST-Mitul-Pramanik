print('Hello')
a='hello'
print(a)

	
b = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(b)

	
a = "Hello, World!"
print(a.replace("H", "J"))

a = "Hello, World!"
print(a.split(","))

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt
y = "ain" not in txt
print(x)
print(y)

	
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))

	
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))

	
quantity = 3
itemno = 567
price = 49.95
myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))