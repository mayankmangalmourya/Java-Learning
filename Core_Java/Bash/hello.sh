#! /bin/bash

name="Hello world variable"

# -----------------Print statement.-----------------
# echo "Hello world"
# echo 'hellp world'

# ----------- Print Variable Data.. -----------------
# echo $name
# echo "$name"

# ------------ User Name and Password Inpurt ------------.
# read -p "Enter your Username: " name
# read -sp "Enter your Password: " password
# echo
# echo $name
# echo $password

# ----------------- Array Input...---------------
# echo "Enter array element : "
# read -a array
# echo "Array Element : ${array[0]}"

# ----------- Date Format -------------
# d=`date '+%a %d-%M-%Y'`
# echo $d

# -------------- Sleep --------------
# start time
# date +"%H:%M:%S"
# echo "Wait for 9 second"
# sleep 9s
# date +"%H:%M:%S"
# echo "Task Completed."

# --------------- Arthimatic Perform --------------
# echo "a=10, b=3"  
# echo "c is the value of addition c=a+b"  
# a=10  
# b=3  
# echo "c= `expr $a + $b`" 

# let "a *=5"  
# echo "Multiply of x by 5, then a="  
# echo $a

# ----------------------- if Statement ---------------
# -eq : equal -gt : greater than -lt : less than -ge : greater than or equal to -le : less than or equal to
# TRUE && FALSE || FALSE || TRUE  
# if [[ 10 -eq 10 && 5 -gt 4 || 3 -eq 4 || 3 -lt 6 ]];  
# then  
# echo "Condition is true."  
# fi  

# # TRUE && FALSE || FALSE  
# if [[ 8 -eq 8 && 8 -gt 10 || 9 -lt 5 ]];  
# then  
# echo "Condition is false"  
# fi  

# --------------- if Else Statement --------------
#when the condition is true  
# if [ 10 -gt 3 ];  
# then  
#   echo "10 is greater than 3."  
# else  
#   echo "10 is not greater than 3."  
# fi  

# #when the condition is false  
# if [ 3 -gt 10 ];  
# then  
#   echo "3 is greater than 10."  
# else  
#   echo "3 is not greater than 10."  
# fi  

# ------------- Else if ----------------
# read -p "Enter a number of quantity:" num  

# if [ $num -gt 200 ];  
# then  
# echo "Eligible for 20% discount"  

# elif [[ $num == 200 || $num == 100 ]];  
# then  
# echo "Lucky Draw Winner"  
# echo "Eligible to get the item for free"  

# elif [[ $num -gt 100 && $num -lt 200 ]];  
# then  
# echo "Eligible for 10% discount"  

# elif [ $num -lt 100 ];  
# then  
# echo "No discount"  
# fi  

# ------------- For Loop ----------------
# start 1 end 10 and increment 1
# for ((i=1; i<=10; i++))  
# do  
# echo "$i"  
# done  

# echo "Series of numbers from 1 to 10."  

str="Let's start learning from Javatpoint."  

for i in $str;  
do  
echo "$i"  
done  