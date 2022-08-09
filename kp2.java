#!/bin/bash
while :; do
read -p "Enter the person's name: " name
read -p "Enter the grade of the person: " grade

case $grade in
30) echo "$name $grade F";;
40) echo "$name $grade C";;
60) echo "$name $grade B";;
90) echo "$name $grade A";;
*) echo "Wrong input"

esac
done
echo "Goodbye"

