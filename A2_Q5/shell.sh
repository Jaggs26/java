echo
javac -h . Student.java
echo 'Java files compiled and Header file created'
echo
g++ -c -I/usr/lib/jvm/java-11-openjdk-arm64/include/ -I/usr/lib/jvm/java-11-openjdk-arm64/include/linux -Wall -Werror -fPIC Student.cpp
g++ -shared -o libStudent.so  Student.o
echo 'Shared library created'
echo
echo "</*****************************************************************************************/>"
echo
echo ">>> Program Running <<<<"
echo
export LD_LIBRARY_PATH=`dirname $0`
java Student
echo
echo "</*****************************************************************************************/>"
echo
