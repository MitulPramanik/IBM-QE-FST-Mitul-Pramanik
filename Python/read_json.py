import json


with open('python/currency.json', 'r') as myfile:
    data=myfile.read()


obj = json.loads(data)


print("usd: " + str(obj['usd'])) 
print("eur: " + str(obj['eur']))
print("gbp: " + str(obj['gbp'])) 