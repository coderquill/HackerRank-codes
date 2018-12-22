###  Given the names and grades for each student in a Physics class of  students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.
#Sample Input 0

#5
#Harry
#37.21
#Berry
#37.21
#Tina
#37.2
#Akriti
#41
#Harsh
#39
#Sample Output 

#Berry
#Harry
###




students = []
marks=[]
names=[]
n=int(input())
for _ in range(0,n):
   students.append([raw_input(),float(input())])
#print students
for i in range(0,n):
    marks.append(students[i][1])
#print marks
marks.sort()
#print marks
#print marks[1]
j=0
for i in range (0,n):   
    if marks[1] == students[i][1]:
       names.append(students [i][0])
       j=j+1
#print names
#names.sort()
#print j
#print names
for i in range(0,j):
    print names[i]

