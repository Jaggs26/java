
echo
javac -h . CheckPalindrome.java
echo 'Java files compiled and Header file created'
echo
g++ -c -I/usr/lib/jvm/java-11-openjdk-arm64/include/ -I/usr/lib/jvm/java-11-openjdk-arm64/include/linux -Wall -Werror -fPIC CheckPalindrome.cpp
g++ -shared  -o libCheckPalindrome.so  CheckPalindrome.o
echo 'Shared library created'
echo
echo "</*****************************************************************************************/>"
echo
echo ">>> Output <<<<"
echo
export LD_LIBRARY_PATH=`dirname $0`
java CheckPalindrome
echo
echo "</*******************************************************************************************/>"
echo
