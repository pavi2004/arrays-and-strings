def uniqueCheck(string):
  temp=[]
  for i in string:
    if i in temp:
      print("not unique")
      return
    else:
      temp.append(i)
  print("unique")  
sstring=input()
uniqueCheck(string)
