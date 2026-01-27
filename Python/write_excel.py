
import pandas
from pandas import ExcelFile
from pandas import ExcelWriter


data = {
  "Vehicle Type": ["Car", "Car", "Bike"],
  "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
  "Model": ["Swift", "Corolla", "Thunderbird"]
}


dataframe = pandas.DataFrame(data)


writer = ExcelWriter("employees.xlsx")


dataframe.to_excel(writer, "employees", index=False)


writer.close()