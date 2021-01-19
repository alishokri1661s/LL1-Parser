# LL1-Parser

To run the code run this code in commandline :
<br />
<dl>
    <dd>java -jar LL(1).jar</dd>
    
</dl>
or you can just execute the run.bat file
<br /><br />
Make sure the input grammar is LL(1).<br />
Type the grammar in input.txt file or another text file with the following format:<br />
<br />
S : EXP<br />
EXP : TERM EXP'<br />
EXP' : + TERM EXP'<br />
EXP' : - TERM EXP'<br />
EXP' : #<br />
TERM : FACTOR TERM'<br />
TERM' : * FACTOR TERM'<br />
TERM' : / FACTOR TERM'<br />
TERM' : #<br />
FACTOR : ID<br />
ID : id ID'<br />
ID' : ++<br />
ID' : --<br />
ID' : #<br />
ID : -- id<br />
ID : ++ id<br />
FACTOR : num<br />
FACTOR : ( EXP )<br />
