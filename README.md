# LL1-Parser

To run the code run this code in commandline :
    java -jar LL(1).jar
or you can just execute the run.bat file

Make sure the input grammar is LL(1).
Type the grammar in input.txt file or another text file with the following format:

S : EXP
EXP : TERM EXP'
EXP' : + TERM EXP'
EXP' : - TERM EXP'
EXP' : #
TERM : FACTOR TERM'
TERM' : * FACTOR TERM'
TERM' : / FACTOR TERM'
TERM' : #
FACTOR : ID
ID : id ID'
ID' : ++
ID' : --
ID' : #
ID : -- id
ID : ++ id
FACTOR : num
FACTOR : ( EXP )
