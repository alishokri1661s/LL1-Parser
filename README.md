# LL1-Parser

## Getting Started
To run the code first download the zip file of the project and extract it <br/>
Then you can run the projtect in two ways:

* Execute the run.bat file
* Run the "java -jar LL(1).jar" command in CMD
**Make sure the input grammar is LL(1).**<br />
If you want to make sure that you grammar is LL(1) or not you can use this [link](https://smlweb.cpsc.ucalgary.ca/start.html).<br/>
Type the grammar in input.txt file or another text file with the following Example.<br />


## Example

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

