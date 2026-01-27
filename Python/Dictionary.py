example_dict =	{
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
print(example_dict)
	
x = example_dict["model"]
print(x)

	
	
example_dict["year"] = 2018
print(example_dict)

	
for x in example_dict:
  print(example_dict[x])

	
for x in example_dict:
  print(x)


	
for x, y in example_dict.items():
  print(x, y)

	
print(len(example_dict))

	
example_dict["color"] = "red"
print(example_dict)

print(len(example_dict))

	
example_dict.pop("model")
print(example_dict) 

	
example_dict.popitem()
print(example_dict)