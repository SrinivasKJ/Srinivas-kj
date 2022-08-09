[ec2-user@ip-172-31-1-1 git-repo]$ ls -a
.  ..  .git
[ec2-user@ip-172-31-1-1 git-repo]$ vi kp1.java
#!/bin/sh
echo “Enter the name of the city”
read Place
case "$Place" in
"mysore") echo "Mysore is a historical city"
;;
"delhi") echo "Delhi is the capital of India"
;;
"bangalore") echo "Bangalore is know as the Silicon
CIty/Garden city/IT hub/ capital of Karnataka"
;;
esac
~

