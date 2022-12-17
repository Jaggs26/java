
echo
javac -h . SortArray.java
echo 'Java files compiled and Header file created'
echo
g++ -c -I/usr/lib/jvm/java-11-openjdk-arm64/include/ -I/usr/lib/jvm/java-11-openjdk-arm64/include/linux -Wall -Werror -fPIC SortArray.cpp
g++ -shared  -o libSortArray.so  SortArray.o
echo 'Shared library created'
echo
echo "</*****************************************************************************************/>"
echo
echo ">>> Program Running <<<<"
echo
export LD_LIBRARY_PATH=`dirname $0`
java SortArray
echo
echo "</*****************************************************************************************/>"
echo
